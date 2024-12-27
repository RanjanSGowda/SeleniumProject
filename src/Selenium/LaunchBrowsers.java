package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class LaunchBrowsers {
    public static void main(String[] args) {

        WebDriver driver;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BrowserName");
        String browserName = sc.next().toLowerCase();

        // Browsers will Open Based on Users input

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.browserstack.com/");
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
//          driver = new FirefoxDriver();
            driver.get("https://google.com/");
        } else {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
//          driver = new EdgeDriver();
            driver.get("https://demoqa.com/register");
        }

        driver.quit();
    }
}
