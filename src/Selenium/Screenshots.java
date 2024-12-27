package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        TakesScreenshot ts=(TakesScreenshot)driver;
        File ss=ts.getScreenshotAs(OutputType.FILE);
        File dd=new File("C://Users//ranja//IdeaProjects//untitled//src//Selenium//test.png");
        FileUtils.copyFile(ss,dd);

        System.out.println("Screenshot taken");
        driver.quit();
    }
}
