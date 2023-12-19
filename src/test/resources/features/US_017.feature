@users @newUsersCreate
Feature: US_017_NewUserCreate

  Background: ortak stepler
    Given kullanici rxDrugsHub sayfasina gider
    When kullanici login bilgilerini girer

  Scenario:  Register New User

    Then kullanici register new user butonu ile yeni kullanici olusturur
    And yeni kullanicinin olustugunu dogrular
    Then sayfayi kapatir

  Scenario:  Invite New User
    Then kullanici invite new user butonu ile yeni kullanici olusturur
    And yeni kullanicinin olustugunu dogrular
    Then sayfayi kapatir