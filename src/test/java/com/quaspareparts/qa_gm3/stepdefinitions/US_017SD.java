package com.quaspareparts.qa_gm3.stepdefinitions;

import com.quaspareparts.qa_gm3.pages.UserModulePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class US_017SD {
    UserModulePage ump = new UserModulePage();

    @And("kullanici user sayfasina gider")
            public void kullanici_user_sayfasina_gider(){
        ump.users.click();
    }

    @Then("kullanici register new user butonu ile yeni kullanici olusturur ve olustugunu dogrular")
    public void kullanici_register_new_user_butonu_ile_yeni_kullanici_olusturur_ve_olustugunu_dogrular() {
       ump.registerNewUserAdd();
    }

    @And("kullanici invite new user butonu ile yeni kullanici olusturur ve olustugunu dogrular")
    public void kullanici_invite_new_user_butonu_ile_yeni_kullanici_olusturur_ve_olustugunu_dogrular() {
        ump.inviteNewUserAdd();
    }


}
