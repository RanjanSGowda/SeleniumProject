package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class WindowsHandlings {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> s=driver.getWindowHandles();

        for(String ss:s)
        {
            driver.switchTo().window(ss);
            String title=driver.getTitle();
            if(title.equals("New Window"))
            {
                System.out.println(driver.findElement(By.className("example")).getText());
                driver.close();
            }
        }
        driver.quit();
    }
}
