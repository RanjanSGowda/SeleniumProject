package Selenium;

import org.openqa.selenium.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImgs {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/broken_images");

        List<WebElement> imgs = driver.findElements(By.tagName("img"));

        int count = imgs.size();
        System.out.println("Total Numbers of Img in Webpage --> " + count);

        for (WebElement e : imgs) {
            String s = e.getAttribute("src");
//            String ss=e.getDomAttribute("src");
//            String sss = e.getDomProperty("src");
            System.out.println(s);
            verifyLinks(s);
        }
        driver.quit();
    }

    public static void verifyLinks(String imgs) {
        try {
            URL link = new URL(imgs);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
//            httpURLConnection.setConnectTimeout(2000);
//            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(imgs + " --> is a broken image");
            } else {
                System.out.println(imgs + " --> is a good image");
            }
        } catch (Exception e) {
        }
    }
}
