package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.ui.context.Theme;

import java.util.List;

public class checkBpxSelection {
    public static void main(String[] args) {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> list=driver.findElements(By.xpath("//*[@class='form-check form-check-inline']/child::input[@type='checkbox']"));

        for(WebElement s:list)
        {
            String day=s.getAttribute("value");
            System.out.println(day);
            if(day.equals("sunday") || day.equals("friday"))
            {
                s.click();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        driver.quit();
    }
}
