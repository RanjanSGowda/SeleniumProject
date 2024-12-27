package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.className("signinbtn")).click();

        Alert a=driver.switchTo().alert();

        //To accept the alert
        a.accept();
        System.out.println("Alert Accepted");

        //To Cancel the Alert
        a.dismiss();
        System.out.println("Alert Dismissed");

        //To Add text to the Alert
        a.sendKeys("Passing text to Alert");

        //To Get text from the Alert
        a.getText();



        driver.quit();


    }
}
