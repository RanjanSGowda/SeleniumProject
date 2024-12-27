package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        Actions a = new Actions(driver);

        WebElement sc = driver.findElement(By.id("column-a"));
        WebElement dc = driver.findElement(By.id("column-b"));

        //Method 1
        a.dragAndDrop(sc, dc);
        System.out.println("Drag and Dropped");

        //Method 2
        a.clickAndHold(sc).moveToElement(dc).release().perform();
        System.out.println("Drag and Dropped...");

        driver.quit();
    }
}
