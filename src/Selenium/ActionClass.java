package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.browserstack.com/");

        //Actions class contains a Constuctor which accepts Webdriver as an arguments
        Actions a=new Actions(driver);

        WebElement ele= driver.findElement(By.id("products-dd-toggle"));
        WebElement ele1=driver.findElement(By.xpath("(//div[.='Automation without coding'])[1]"));

        //MouseHover to the Element
        a.moveToElement(ele).perform();
        Thread.sleep(5000);
        a.click(ele1).perform();
        Thread.sleep(5000);
        System.out.println("Action completed");

        //Right Click on the Element
        a.contextClick(ele);
        System.out.println("Right Clicked");

        driver.quit();
    }
}
