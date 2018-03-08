package org.exostar.ts;


import org.exostar.config.BaseTest;
import org.exostar.config.extendreport.ExtentTestManager;
import org.exostar.po.LoginPO;
import org.exostar.util.Util;
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

/*@Test
    public void LoginTest_55285(){
        if(flag > 0) {
            ExtentTestManager.getTest().getTest().setName("ET-85: Verify user should be able to login in to GMAIL using invalid credential.");
            ExtentTestManager.getTest().assignCategory("Component: Login Test");
        }
        LoginPO loginPage=new LoginPO(driver);

        //Step 1 :: Enter valid Username
        Assert.assertEquals(loginPage.typeUsername(), true,"User not able to enter User Name");

        //Step 2 :: Click next
        Assert.assertEquals(loginPage.clickButton(loginPage.username_next_button), true,"User not able to click next");

        //Step 3 :: Enter valid Password
        Assert.assertEquals(loginPage.typePassword(), true,"User not able to enter Password");

        //Step 4 :: Click next
        Assert.assertEquals(loginPage.clickButton(loginPage.password_next_button), true,"User not able to click next");
    }

    @Test
    public void LoginTest_55287(){
        if(flag > 0) {
            ExtentTestManager.getTest().getTest().setName("ET-86: Verify user should not be able to login in to GMAIL using invalid credential");
            ExtentTestManager.getTest().assignCategory("Component: Login Test");
        }
        LoginPO loginPage=new LoginPO(driver);

        //Step 1 :: Enter valid Username
        Assert.assertEquals(loginPage.typeUsername(), true,"User not able to enter User Name");

        //Step 3 :: Enter valid Password
        Assert.assertEquals(loginPage.typePassword(), true,"User not able to enter Password");

        //Step 2 :: Click next
        Assert.assertEquals(loginPage.clickButton(loginPage.username_next_button), true,"User not able to click next");

        //Step 4 :: Click next
        Assert.assertEquals(loginPage.clickButton(loginPage.password_next_button), true,"User not able to click next");
    }*/
    
    
    @Test
    public void VerifyBAIDLoginWithValidCredential_55377(){
    	if(flag > 0) {
            ExtentTestManager.getTest().getTest().setName("ET-87: Verify that user is able to log in to BAID using valid credential");
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
