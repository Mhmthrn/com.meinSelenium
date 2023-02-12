package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/driver/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);// yazilan milisaniye kadar kodlari bekletir.

        System.out.println("sys url > "+driver.getCurrentUrl());//https://www.amazon.com/


        System.out.println("sys title > "+driver.getTitle());//Amazon.com. Spend less. Smile more.

        driver.close();





    }
}
