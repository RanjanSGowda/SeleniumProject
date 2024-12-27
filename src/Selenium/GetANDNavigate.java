package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetANDNavigate {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Get
        driver.get("https://google.com/");

        //Navigate
        driver.navigate().to("https://amazon.com/");
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();

        System.out.println("Pass");

        driver.quit();
    }
}
