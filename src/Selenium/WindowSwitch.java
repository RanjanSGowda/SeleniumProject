package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowSwitch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://expired.badssl.com/");

        String windowID=driver.getWindowHandle();
        System.out.println(windowID);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");

        Set<String> windowIDs=driver.getWindowHandles();
        System.out.println(windowIDs);

        driver.quit();

    }
}
