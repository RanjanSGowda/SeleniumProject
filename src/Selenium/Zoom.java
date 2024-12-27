package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='150%'");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Page zoomed in");

        js.executeScript("document.body.style.zoom='50%'");

        System.out.println("Page zoomed out");

        WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'GUI Elements')]"));
        js.executeScript("arguments[0].setAttribute('style', 'transform: scale(1.5); transform-origin: 0 0;');",ele);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Specific ele zoomed in");

        driver.quit();
    }
}
