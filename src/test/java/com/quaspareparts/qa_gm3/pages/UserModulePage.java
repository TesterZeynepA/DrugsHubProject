package com.quaspareparts.qa_gm3.pages;

import com.quaspareparts.qa_gm3.utilities.Driver;
import com.quaspareparts.qa_gm3.utilities.ParallelDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserModulePage {
    public UserModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(ParallelDriver.getDriver());
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id = "link7")
    public WebElement users;

    @FindBy(xpath = "//*[contains(text(),'Invite New User')]")
    public WebElement inviteNewUser;

    @FindBy(xpath = "//*[contains(text(),'New User Registration')]")
    public WebElement newUserRegistration;

    @FindBy(xpath = "//*[contains(text(),'Register New User')]")
    public WebElement registerNewUser;

    @FindBy(id = "react-select-2-input")
    public WebElement roles;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//button [@class='btn btn-info text-white float-end']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'Successful')]")
    public WebElement successfullMessage;

    @FindBy(className = "toast-body")
    public WebElement getPassword;

    @FindBy(xpath = "//*[contains(text(),'Close')]")
    public WebElement registerCloseButton;

    @FindBy(xpath = "//*[contains(text(),'Blocked')]")
    public WebElement accessBlocked;

    @FindBy(xpath = "(//td[@role='cell'])[5]")
    public WebElement statusEmpty;

    @FindBy(xpath = "(//button[@class=\"btn btn-transparent p-0\"])[1]")
    public WebElement threeDotButton;

    @FindBy(xpath = "(//*[contains(text(),'Password Reset')])[1]")
    public WebElement passwordReset;

    @FindBy(xpath = "(//*[contains(text(),'Resend Verify Email')])[1]")
    public WebElement resendVerifyEmail;

    @FindBy(xpath = "(//*[contains(text(),'Allow Access')])[1]")
    public WebElement allowAccess;

    @FindBy(xpath = "//*[contains(text(),'Reset Password')]")
    public WebElement resetPasswordPopup;

    @FindBy(xpath = "//*[contains(text(),'Confirm')]")
    public WebElement confirmButton;

    @FindBy(xpath = "//*[contains(text(),'New User Invitation')]")
    public WebElement newUserInvitation;
    @FindBy(id = "react-select-2-input")
    public WebElement roles2;

    @FindBy(id = "email")
    public WebElement email2;

    @FindBy(xpath = "//*[contains(text(),'Send Invitation')]")
    public WebElement sendInvitation;

    public void inviteNewUserAdd(){
        inviteNewUser.click();
        Assert.assertTrue(newUserInvitation.isDisplayed());
        actions.click(roles2).sendKeys("Business Owner" + Keys.ENTER).perform();
        actions.click(email2).sendKeys("woyija3587@astegol.com" + Keys.ENTER).perform();
        sendInvitation.click();



    }

    public void registerNewUser(){
        registerNewUser.click();
        Assert.assertTrue(newUserRegistration.isDisplayed());
        actions.click(roles).sendKeys("Business Owner" + Keys.ENTER).perform();

        actions.click(email).sendKeys("tester007@gmail.com" + Keys.ENTER).perform();

        registerButton.click();

        Assert.assertTrue(successfullMessage.isDisplayed());

        getPassword.getText();

        registerCloseButton.click();

    }

    public void registerNewUserStatus(){
        Assert.assertTrue(accessBlocked.getText().contains("Blocked"));

        Assert.assertEquals("", statusEmpty.getText());

        actions.click(threeDotButton).perform();

        Assert.assertTrue(passwordReset.isDisplayed());
        Assert.assertTrue(resendVerifyEmail.isDisplayed());
        Assert.assertTrue(allowAccess.isDisplayed());
    }

    public void newUserVerify(){
        passwordReset.click();
       Assert.assertTrue(resetPasswordPopup.isDisplayed());
       confirmButton.click();


    }

}
