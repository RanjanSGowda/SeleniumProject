package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Method 1
        WebElement ele = driver.findElement(By.id("name"));
        ele.sendKeys("Ranjan Kumar S S");

        //Method 2
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','Ranjan Kumar S S'",ele);

        //Method 3
        js.executeScript("document.getElementByID('name').setAttribute('value','Ranjan Kumar S S'",ele);
    }
}
