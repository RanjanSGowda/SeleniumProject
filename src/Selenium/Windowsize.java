package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/register");

        //To set the size of the window
        Dimension d = new Dimension(200,100);
        driver.manage().window().setSize(d);

        System.out.println("Dimension TC Passed");



        //To set the position of the window
        Point p = new Point(250, 250);
        driver.manage().window().setPosition(p);
        Thread.sleep(1000);

        System.out.println("Position TC Passed");

        driver.quit();

    }
}
