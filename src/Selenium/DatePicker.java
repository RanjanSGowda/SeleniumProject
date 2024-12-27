package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.ui.context.Theme;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        String year = "2029";
        String month = "December";
        String datea="21";


        driver.findElement(By.id("txtDate")).click();
        WebElement date = driver.findElement(By.className("ui-datepicker-month"));
        System.out.println(date.getText());
        date.click();

        Select s = new Select(date);
        s.selectByValue("11");

        WebElement Year = driver.findElement(By.className("ui-datepicker-year"));
        System.out.println(Year.getText());
        Year.click();
        Select ss = new Select(Year);
        ss.selectByValue(year);

        driver.findElement(By.xpath("//a[@data-date='" + datea + "']")).click();
        Thread.sleep(4000);

        WebElement ele=driver.findElement(By.name("SelectedDate"));
        System.out.println(ele.getText());

        driver.quit();
    }
}
