
@remoteUnit @isDisplayed
Feature: US_010_isDisplayed

  Scenario:  Department isDisplayed
    Given kullanici rxDrugsHub sayfasina gider
    When kullanici login bilgilerini girer
    And kullanici remote units sayfasina gider
    Then kullanici web elementin gorunurlugunu kontrol eder
    And sayfayi kapatir