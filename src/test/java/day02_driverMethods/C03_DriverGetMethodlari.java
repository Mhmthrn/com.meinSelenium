package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        System.out.println(driver.getWindowHandle());
        //CDwindow-5F6D29DD4BC4CA3AAD2EDFD595DAA1B0
        //CDwindow-A2D1103DD52F49394DAD682A76CC7098

        System.out.println(driver.getWindowHandles());



        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());
        // web sayfasinin tum klaynak kodlarini getirir

        driver.close();


    }
}
