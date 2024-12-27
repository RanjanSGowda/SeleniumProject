package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        //To upload single file
        WebElement ele=driver.findElement(By.id("file-upload"));
        String path="C:\\Users\\ranja\\IdeaProjects\\untitled\\src\\Selenium\\test.png";
        ele.sendKeys(path);
        Thread.sleep(9000);
        System.out.println("One File Uploaded");

        //Multiple File upload --> Add \n and pass second file path
        driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\ranja\\Downloads\\info.pdf\nC:\\Users\\ranja\\Downloads\\info1.pdf");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Upload Multiple Files')]")).click();


    }
}
