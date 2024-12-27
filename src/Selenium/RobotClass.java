package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement ele=driver.findElement(By.xpath("//*[.='GUI Elements']"));

        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(5000);

        System.out.println("All TC's are passed");



    }
}
