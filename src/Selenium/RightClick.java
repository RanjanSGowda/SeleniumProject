package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;




public class RightClick {
    public static void main(String[] args) throws InterruptedException, AWTException {
        // Correct system property key
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Open the target webpage and maximize the window
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Find the "YouTube" link element
        WebElement ele = driver.findElement(By.xpath("//a[.='Youtube']"));

        // Perform right-click action
        Actions actions = new Actions(driver);
        actions.contextClick(ele).perform();

        // Use Robot class to navigate the context menu
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Pause for observation
        Thread.sleep(4000);

        System.out.println("Passed");

        // Close the browser
        driver.quit();
    }
}

