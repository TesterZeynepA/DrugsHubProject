package com.quaspareparts.qa_gm3.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
  /*
      POM'de Driver icin TestBase class'ina extends etmek yerine
      Driver class'indan static method'lar kullanarak
      driver olusturup, ilgili ayarlarin yapilmasi
      ve en sonda driver'in kapatilmasi tercih edilmistir.
      POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini
      engellemek icin
      Singleton pattern kullanimi benimsenmistir.
      Singleton Pattern : tekli kullanim, bir class'in farkli class'lardan
      obje olusturularak kullanimini engellemek icin kullanilir.
      Bunu saglamak icin yapmamiz gereken sey oldukca basit
      obje olusturmak icin kullanilan constructor'i private yaptiginizda
      baska class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ
       */

public class Driver {
    // create a private static WebDriver object
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    //singleton driver yapmak için constructorımızı private yapıyoruzki bu classın dışından new anahtarıyla
    // driver object üretilemesin. Peki kim driver üretecek? getDriver() metodumuz.
    private Driver() { //constructor Driver
    }
    // create getDriver method to create and initiate the driver instance
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            //bu şekilde sadece bir driver object üretilmesini garantiliyoruz. daha önce driver üretilmişse null olmayacaktır ve
            //bu if bloğu çalışmayacak ve yeni driver üretilmeyecektir. Var olan (daha önce üretilmiş olan) driverı return edecektir.
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
               /* case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;*/
            }
        }
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get().manage().window().maximize();
        return driver.get();
    }

    public static void closeDriver() {
    }
}