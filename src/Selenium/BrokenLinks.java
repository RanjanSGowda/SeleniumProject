package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/broken");

        List<WebElement> link=driver.findElements(By.tagName("a"));
        int count= link.size();
        System.out.println("Total number of links on the Page --> "+count);

        for(WebElement e:link)
        {
            String s=e.getAttribute("href");
            verifyLinks(s);
        }
        driver.quit();
    }

    public static void verifyLinks(String links) {
        try {
            URL link = new URL(links);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
//            httpURLConnection.setConnectTimeout(2000);
//            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(links + " --> is a broken Link");
            }
        } catch (Exception e) {
        }
    }
}

