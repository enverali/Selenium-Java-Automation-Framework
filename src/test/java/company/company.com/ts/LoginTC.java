package org.exostar.ts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends BaseTest {

    public int flag = 1;

    public LoginTC(){}

    public LoginTC(WebDriver passDriver, int Flag) {
        driver = passDriver;
        flag = Flag;
    }

    
    @Test
    public void VerifyLoginWithValidCredential(){
    	if(flag > 0) {
            ExtentTestManager.getTest().getTest().setName(" Verify that user is able to log in to using valid credential");
            ExtentTestManager.getTest().assignCategory("Component: Login Test");
        }
        LoginPO loginPage=new LoginPO(driver);
        

        //Step 1 :: Enter valid Username
        Assert.assertEquals(loginPage.typeUsername(), true,"User is not able to enter the Username");

        //Step 2 :: Enter valid Password
        Assert.assertEquals(loginPage.typePassword(), true,"User not able to enter Password");

        //Step 3 :: Click next
        Assert.assertEquals(loginPage.clickSignInButton(), true,"User is not able to click on Login button");
        Util.pause(10000);

        
        
    }
   
}
