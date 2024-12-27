package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        WebElement ele = driver.findElement(By.linkText("GeneratePress"));

        JavascriptExecutor js=(JavascriptExecutor)driver;

        //Scroll to the Element
        js.executeScript("arguments[0].scrollIntoView[true]",ele);
        Thread.sleep(5000);
        System.out.println(ele.getAttribute("href"));

        //Highlight the Element

        js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 2px green')",ele);

        Thread.sleep(1000);

        driver.quit();

    }
}
