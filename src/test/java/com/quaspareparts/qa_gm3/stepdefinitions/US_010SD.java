package com.quaspareparts.qa_gm3.stepdefinitions;

import com.quaspareparts.qa_gm3.pages.RemoteUnitsPage;
import com.quaspareparts.qa_gm3.utilities.ConfigReader;
import com.quaspareparts.qa_gm3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_010SD {
    RemoteUnitsPage rup = new RemoteUnitsPage();
    @Given("kullanici rxDrugsHub sayfasina gider")
    public void kullanici_rx_drugs_hub_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici login bilgilerini girer")
    public void kullanici_login_bilgilerini_girer() {
        rup.loginButton.click();
        rup.username.sendKeys("bo2@qualitron.com");
        rup.password.sendKeys("0tubHqRFkBMXvNN");
        rup.signInButton.click();
        rup.businessOwnerButton.click();
        rup.profileButton.click();
        rup.accountManagement.click();
    }
    @And("kullanici remote units sayfasina gider")
    public void kullanici_remote_units_sayfasina_gider(){
        rup.remoteUnits.click();
    }

    @Then("kullanici web elementin gorunurlugunu kontrol eder")
    public void kullanici_web_elementin_gorunurlugunu_kontrol_eder() {
            Assert.assertTrue(rup.kolnWarehouse.isDisplayed());
    }
    @And("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
