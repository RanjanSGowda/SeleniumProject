package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> links = driver.findElements(By.tagName("img"));

        for (WebElement e : links) {
            String url = e.getAttribute("src");
            verifyBrokenLinks(url);
        }
        driver.quit();

    }

    public static void verifyBrokenLinks(String url) throws IOException {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(url + " --> is broken");
            }

        } catch (Exception e) {

        }
    }


}
