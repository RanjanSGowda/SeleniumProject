package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SelectClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ironspider.ca/forms/dropdowns.htm");
        WebElement element=driver.findElement(By.name("coffee"));

        Select s=new Select(element);

        // To Print all the options in DropDowns
        List<WebElement> options = s.getOptions();
        for(WebElement e:options)
        {
            System.out.println(e.getAttribute("value"));
        }

        //Select by Index
        s.selectByIndex(2);

        List<WebElement> all=s.getAllSelectedOptions();
        for(WebElement f:all)
        {
            System.out.println("The Selected option by Index is --> " + f.getAttribute("value"));
        }

        //Select by Value
        s.selectByValue("crisp");

        List<WebElement> af=s.getAllSelectedOptions();
        for(WebElement g:af)
        {
            System.out.println("The Selected option by Value is --> "+ g.getText());
        }

        //Select by VisibleText
        s.selectByVisibleText("Black");

        List<WebElement> ag=s.getAllSelectedOptions();
        for(WebElement j:ag)
        {
            System.out.println("The Selected option from VisibleText is --> "+ j.getAttribute("value"));
        }

        //Deselect by Index
        s.selectByIndex(1);
        System.out.println("The Index 1 is selected");
        s.deselectByIndex(1);
        System.out.println("The Index 1 is deselected");

        //Deselect by Value
        s.selectByValue("cream");
        System.out.println("The value is selected");
        s.deselectByValue("cream");
        System.out.println("The value is deselected");

        //Deselect by Visibletext
        s.selectByVisibleText("With cream");
        System.out.println("The Visibletext is selected");
        s.deselectByValue("With cream");
        System.out.println("The Visibletext is deselected");

        //To deselected all options

        s.deselectAll();
        System.out.println("Deselected all the options");

        //isMultiple
        System.out.println(s.isMultiple());

        System.out.println("Pass");


        driver.quit();
    }
}
