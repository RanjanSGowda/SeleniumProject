package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        List<WebElement> tb=driver.findElements(By.xpath("//td[.='English']/preceding-sibling::td[4]/input"));

        int count=tb.size();
        System.out.println("The total count --> "+ count);


        for(WebElement e:tb)
        {
            e.click();
            Thread.sleep(3000);
        }

    }
}
