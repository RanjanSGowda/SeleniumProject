package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //Explicit wait
        WebElement ele =driver.findElement(By.id("ID Here"));

//        WebDriverWait wait=new WebDriverWait(driver,2000);
//        wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
//
//        WebDriverWait wait1 = new WebDriverWait(driver, 3000);
//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ID here"))).click();

        driver.quit();


    }
}
