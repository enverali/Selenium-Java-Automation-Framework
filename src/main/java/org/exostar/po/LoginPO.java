package org.exostar.po;

import org.exostar.util.Constant;
import org.exostar.util.ExcelOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO {

    public WebDriver driver;
    public String userName = "";
    public String userPass = "";

    public LoginPO(WebDriver driver) {
        this.driver = driver;
        String userData = ExcelOperations.readFromExcel(Constant.ADMIN);
        userName = userData.split(" ")[0];
        userPass = userData.split(" ")[1];
    }

    //Locators
    // Exostar page locator
    /*public By login_username_input = By.id("accessLoginId");
    public By login_password_input = By.id("accessuserpassword");
    public By login_button_input = By.xpath("//input[@value='Login']");*/

    // Gmail page locator
   /* public By login_username_input = By.id("identifierId");
    public By username_next_button = By.id("identifierNext");
    public By password_next_button = By.id("passwordNext");
    public By login_password_input = By.name("password");
    public By login_button_input = By.xpath("//input[@value='Login']");*/
    
    
    //BAID Page Locator
    public By login_username_input = By.id("accessLoginId");
    public By login_password_input = By.id("accessuserpassword");
    public By login_button_input = By.id("LoginBtn");
    


    //Enter Username
    public boolean typeUsername(){
        try {
            //   String userNT = System.getProperty("USER_ID");
            WebElement username=(new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(login_username_input));
            username.sendKeys(userName);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    //Enter Password
    public boolean typePassword(){
        try {
            WebElement password=(new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(login_password_input));
            password.sendKeys(userPass);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    //Click Button
    public boolean clickButton(By xpath){
        try {
            WebElement login=(new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(xpath));
            login.click();
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    //Click Login Button
    public boolean clickSignInButton(){
        try {
            WebElement login=(new WebDriverWait(driver,10))
                    .until(ExpectedConditions.visibilityOfElementLocated(login_button_input));
            login.click();
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
