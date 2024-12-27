package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class CheckBoxANDRadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/radio-button");

        //Radio button
        driver.findElement(By.id("yesRadio")).click();
        System.out.println("Radio Button is selected");

        //Single Check Box
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.findElement(By.className("rct-icon rct-icon-uncheck")).click();
        System.out.println("Single Check Box Checked");

        //To select multiple checkbox
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[1]")).click();


        List<WebElement> all=driver.findElements(By.className("rct-title"));

        for(WebElement e:all)
        {
          String s=  e.getText();
            if(s.equals("Documents")||s.equals("Downloads"))
            {
                e.click();
            }
        }
        System.out.println(driver.findElement(By.id("result")).getText());

        driver.quit();


    }
}
