package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //ID
        WebElement id=driver.findElement(By.id("name"));

        //ClassName
        WebElement clNm=driver.findElement(By.className("blog-pager"));

        //Name
        WebElement name=driver.findElement(By.name("gender"));

        //TagName
        WebElement tgNm=driver.findElement(By.tagName("title"));

        //LinkText
        WebElement linkTx=driver.findElement(By.linkText("GUI Elements"));
        linkTx.click();
        System.out.println(driver.getCurrentUrl());

        //Partial LinkText
        WebElement parLinkTx=driver.findElement(By.partialLinkText("Hidden"));
        parLinkTx.click();
        System.out.println(driver.getTitle());

        //CssSelector
        WebElement cssSel=driver.findElement(By.cssSelector("#result"));

        //Xpath
        WebElement xpath=driver.findElement(By.xpath("//*[@id='name']"));

        System.out.println("All Scenarios are passed");

        driver.quit();

    }
}
