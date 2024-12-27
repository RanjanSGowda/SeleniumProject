package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://wpengine.com/support/add-domain-in-user-portal/");

        List<WebElement> all=driver.findElements(By.tagName("iframe"));
        int count=all.size();
        System.out.println("Total number of iFrames are --> "+ count);

        //Switch to iframe by index
        driver.switchTo().frame(1);

        //Switch to iframe by ID
        driver.switchTo().frame("ID");

        //Switch to iframe by Name
        driver.switchTo().frame("Name");

        //Switch to iframe by WebElement
        WebElement e=driver.findElement(By.xpath("//iframe[@data-tagging-id=\"AW-967467428\"]"));
        driver.switchTo().frame(e);

        driver.quit();
    }
}
