package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {
        /*
        Gerekli ayarlamalari yapip mazon anasayfasina gidin
        1- sayfa balsigi amazon kelimesi icermeli
        2- sayfa url'sinde "Amazon" kelimesi olmali
         */

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();


        driver.get("https://www.amazon.com");

        String expectedTitleIcerik="amazon";

        String expectedUrlIcerik="Amazon";

        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

        // url  test yapalim

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test passed");
        }else{
            System.out.println("Url test failed");
            System.out.println("Actual url : "+ actualUrl);
            System.out.println("actual urle aranan "+ expectedUrlIcerik+" kelimesini icermiyor");
        }

        // title test

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title test passed");
        }
        else{
            System.out.println("Title test failed");
            System.out.println("actual Title : "+ actualTitle);
            System.out.println("actual title aranan "+ expectedTitleIcerik+" kelimesini icermiyor");
        }

        driver.quit();







    }

}
