package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.driver.chrome", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Enter Text
        driver.findElement(By.id("name")).sendKeys("Ranjan Kumar");
        driver.findElement(By.id("email")).sendKeys("ranjangowda360@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9148644855");
        driver.findElement(By.id("textarea")).sendKeys("Ranjan S/O Somegowda, Suragahalli");


        //Radio button
        driver.findElement(By.id("male")).click();


        //CheckBox
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='form-check form-check-inline']/child::input[@type='checkbox']"));
        for (WebElement e : list) {
            String s = e.getAttribute("value");
            if (s.equals("sunday") || s.equals("thursday")) {
                e.click();
                Thread.sleep(3000);
            }
        }

        //Select class usage
        WebElement ele = driver.findElement(By.id("country"));
        Select s = new Select(ele);
        s.selectByVisibleText("India");

        WebElement ele1 = driver.findElement(By.id("colors"));
        Select s1 = new Select(ele1);

        s1.selectByValue("red");

        WebElement ele2 = driver.findElement(By.id("animals"));
        Select s2 = new Select(ele2);
        s2.selectByIndex(3);

        //1 File upload
        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\ranja\\Downloads\\info.pdf");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Upload Single File')]")).click();

        //Multiple File upload --> Add \n and pass second file path
        driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\ranja\\Downloads\\info.pdf\nC:\\Users\\ranja\\Downloads\\info1.pdf");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Upload Multiple Files')]")).click();

        //Alerts Scenarios

        driver.findElement(By.id("alertBtn")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmBtn")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promptBtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Ranjan");
        driver.switchTo().alert().accept();

        //Actions Class

        Actions actions=new Actions(driver);

        //Move to ele
        WebElement ele3=driver.findElement(By.className("dropbtn"));
        actions.moveToElement(ele3).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();

        //double click on ele
        driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]")).click();

        //drag & drop
        WebElement sc=driver.findElement(By.id("draggable"));
        WebElement ds=driver.findElement(By.id("droppable"));

        actions.clickAndHold(sc).moveToElement(ds).build().perform();
//        actions.dragAndDrop(sc,ds);

        //Scrolling Dropdowns
        driver.findElement(By.id("comboBox")).click();

        for(int i=1;i<=99;i++)
        {
            actions.sendKeys(Keys.DOWN).perform();
        }
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);


        System.out.println("All Tests are passed");
        driver.quit();
    }
}
