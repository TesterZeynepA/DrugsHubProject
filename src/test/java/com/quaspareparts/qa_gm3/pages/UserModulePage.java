package com.quaspareparts.qa_gm3.pages;

import com.quaspareparts.qa_gm3.utilities.Driver;
import com.quaspareparts.qa_gm3.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserModulePage {
    public UserModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(Driver.getDriver());

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

    @FindBy(className = "css-8mmkcg")
    public WebElement roles;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//button [@class='btn btn-info text-white float-end']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'Successful')]")
    public WebElement successfullMessage;

    @FindBy(className = "toast-body")
    public WebElement getPassword;

    @FindBy(xpath = "//*[contains(text(),'Close')]")
    public WebElement registerCloseButton;

    @FindBy(xpath = "//*[contains(text(),'New User Invitation')]")
    public WebElement newUserInvitation;
    @FindBy(id = "react-select-2-input")
    public WebElement roles2;

    @FindBy(id = "email")
    public WebElement email2;

    @FindBy(xpath = "//*[contains(text(),'Send Invitation')]")
    public WebElement sendInvitation;

    @FindBy(xpath = "(//td[@role='cell'])[2]")
    public WebElement inviteNewUserEmail;

    public void inviteNewUserAdd(){
        String email = "yejifi4663@astegol.com";
        inviteNewUser.click();
        Assert.assertTrue(newUserInvitation.isDisplayed());
        actions.click(roles2).sendKeys("Business Owner" + Keys.ENTER).perform();
        actions.click(email2).sendKeys(email + Keys.ENTER).perform();
        sendInvitation.click();
        Assert.assertEquals(email,inviteNewUserEmail.getText());

    }

    public void registerNewUserAdd(){
        registerNewUser.click();
        //Assert.assertTrue(newUserRegistration.isDisplayed());

        actions.click(roles).sendKeys("Business Owner" + Keys.ENTER).perform();

        actions.click(email).sendKeys("tester00719@gmail.com" + Keys.ENTER).perform();

        registerButton.click();

        Assert.assertTrue(successfullMessage.isDisplayed());

        getPassword.getText();

        registerCloseButton.click();

    }

}
