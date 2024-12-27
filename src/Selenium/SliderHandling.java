package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// Need to work on this more

public class SliderHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement ele = driver.findElement(By.xpath("//div[@id='slider']//span"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(ele, 40, 50);


        Thread.sleep(5000);
    }
}
