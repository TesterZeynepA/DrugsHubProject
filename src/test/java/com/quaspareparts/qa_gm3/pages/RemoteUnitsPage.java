package com.quaspareparts.qa_gm3.pages;

import com.quaspareparts.qa_gm3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoteUnitsPage {
    public RemoteUnitsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id = "link5")
    public WebElement remoteUnits;

    @FindBy(xpath = "//*[contains(text(),'Köln Warehouse')]")
    public WebElement kolnWarehouse;


}

