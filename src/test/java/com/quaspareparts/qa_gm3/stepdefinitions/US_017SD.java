package com.quaspareparts.qa_gm3.stepdefinitions;

import com.quaspareparts.qa_gm3.pages.UserModulePage;
import com.quaspareparts.qa_gm3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_017SD {
    UserModulePage ump = new UserModulePage();
    @Given("kullanici rxDrugsHub sayfasina gider")
    public void kullanici_rx_drugs_hub_sayfasina_gider() {
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/a3m/#/users");
    }
    @When("kullanici login bilgilerini girer")
    public void kullanici_login_bilgilerini_girer() {
       ump.username.sendKeys("bo2@qualitron.com");
       ump.password.sendKeys("0tubHqRFkBMXvNN");
       ump.signInButton.click();
       ump.users.click();
    }
    @Then("kullanici register new user butonu ile yeni kullanici olusturur")
    public void kullanici_register_new_user_butonu_ile_yeni_kullanici_olusturur() {
       ump.registerNewUser();
    }
    @And("kullanici invite new user butonu ile yeni kullanici olusturur")
    public void kullanici_invite_new_user_butonu_ile_yeni_kullanici_olusturur() {

    }
    @Then("yeni kullanicinin olustugunu dogrular")
    public void yeni_kullanicinin_olustugunu_dogrular() {

    }


}
