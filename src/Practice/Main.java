//package Practice;
//
//import dev.failsafe.internal.util.Assert;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException, IOException {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranja\\OneDrive\\Documents\\chromedriver.exe");
////        WebDriver driver = new ChromeDriver();
//
//        System.setProperty("webdriver.chrome.dr","");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//
//        WebElement e=driver.findElement(By.id(""));
//
//
//       List<WebElement> ele1 =driver.findElements(By.tagName("a"));
//       int size=ele1.size();
//
//       for(WebElement i:ele1)
//       {
//           System.out.println(i.getAttribute(""));
//       }
//
//       Actions a =new Actions(driver);
//       a.contextClick(e);
//       a.moveToElement(e);
//       a.moveToElement(e).doubleClick();
//
//
//       Select s=new Select(e);
//
//       List<WebElement> p=s.getAllSelectedOptions();
//
//       s.selectByValue("");
//       s.selectByIndex(1);
//       s.selectByVisibleText("coffe");
//
//       TakesScreenshot screenshot=(TakesScreenshot)driver;
//       File s=screenshot.getScreenshotAs(OutputType.FILE);
//       File dd=new File("");
//       FileUtils.copyFile(s,dd);
//
////        URL links=new URL();
//        HttpURLConnection connection=(HttpURLConnection) links.openConnection();
//
//
//
//
//
//
//
//
////        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
////        driver.get("https://demoqa.com/register");
////        String Expectedurl = "https://www.browserstack.com/";
////        driver.get(Expectedurl);
////        driver.manage().window().maximize();
////
////        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////        String Actualurl = driver.getCurrentUrl();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////
////        Assert.isTrue(Expectedurl.contains(Actualurl), "The url is incorrect");
////        driver.findElement(By.name("login")).isDisplayed();
////
////        driver.navigate().to("https://www.google.com/");
////        driver.navigate().back();
////        driver.getTitle().contains(Expectedurl);
////
////        driver.findElement(By.id("email")).sendKeys("Selenium.Ranjan");
////        driver.findElement(By.name("pass")).sendKeys("Selenium.Ranjan");
////        driver.findElement(By.partialLinkText("Forgotten password?")).isEnabled();
//
////
//
////
////        // Checkbox click
////
////        driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();
//
////        driver.findElement(By.name("q")).sendKeys("Java");
////        List<WebElement> sug=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
////        int count=sug.size();
////        System.out.println(count);
////        for(WebElement ele:sug)
////        {
////            System.out.println(ele.getText());
////        }
////
////        sug.get(count-1).click();
////        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
//
//        //Select Class
////        WebElement ele=driver.findElement(By.name("coffee"));
////        driver.get("https://www.browserstack.com/");
////        Select s=new Select(ele);
////       List<WebElement> elem=s.getOptions();
////        for (WebElement e:elem)
////        {
////            System.out.println(e.getAttribute("value"));
////        }
////
////        s.selectByIndex(1);
////        s.selectByVisibleText("With sugar");
//
//        // Action Class
////driver.get("https://demoqa.com/droppable");
////Actions a=new Actions(driver);
////WebElement source= driver.findElement(By.id("draggable"));
////        WebElement Destination = driver.findElement(By.id("droppable"));
////a.dragAndDrop(source,Destination);
////a.moveToElement(driver.findElement(By.id("products-dd-toggle"))).build().perform();
////driver.findElement(By.xpath("//*[contains(text(),'Cross-browser testing')] ")).click();
////String url=driver.getCurrentUrl();
////        System.out.println(url);
////        driver.get("https://www.google.com/");
////        Actions a=new Actions(driver);
////        WebElement ab=driver.findElement(By.linkText("Gmail"));
////        Thread.sleep(3000);
////        a.contextClick(ab);
//
//
//        // Alert
////        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
////        driver.manage().window().maximize();
////        driver.findElement(By.name("proceed")).click();
////
////        Alert a= driver.switchTo().alert();
////        String aa =a.getText();
////        System.out.println(aa);
////        a.accept();
//
//
////        JavascriptExecutor
////        driver.get("https://www.browserstack.com/");
//        driver.manage().window().maximize();
//////        JavascriptExecutor js= (JavascriptExecutor) driver;
////        WebElement e=driver.findElement(By.linkText("Sitemap"));
////        // Scroll till ele
////        js.executeScript("arguments[0].scrollIntoView(true)",e);
////        Thread.sleep(2000);
//
////        JavascriptExecutor js= (JavascriptExecutor) driver;
////        WebElement b=driver.findElement(By.xpath("//*[contains(text(),'Ready to try it out?')]"));
////        js.executeScript("arguments[0].scrollIntoView(true)",b);
////        Thread.sleep(2000);
////        //highlight ele
////        js.executeScript("arguments[0].setAttribute('style','background:red')",b);
////        Thread.sleep(3000);
//
//        //WindowsHandle
////        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
//        Set<String> windowsId = driver.getWindowHandles();
//
//        List<String> ids = new ArrayList<>(windowsId);
//
//        for (String ele : ids) {
//            System.out.println(ele);
//            driver.switchTo().window(ele);
//            String title = driver.switchTo().window(ele).getTitle();
//
//            System.out.println(title);
//            if (title.equals("Human Resources Management Software | OrangeHRM")) {
//                driver.close();
//            }
//        }
//
//////        Explicit wait
////        WebDriverWait wait=new WebDriverWait(driver,2000);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).click();
//
//        //Broken Links
////        driver.get("https://demoqa.com/broken"); //
////        List<WebElement> links = driver.findElements(By.tagName("a"));
////        for (WebElement e : links) {
////            String url = e.getAttribute("href");
////            verifyLinks(url);
////        }
//
//        //Broken Image
////        driver.get("https://the-internet.herokuapp.com/broken_images");
////        List<WebElement> links=driver.findElements(By.tagName("img"));
////        for(WebElement e:links)
////        {
////            String imgs=e.getAttribute("src");
////            verifyLinks(imgs);
////        }
//
////        List<WebElement> links=driver.findElements(By.tagName("img"));
////
////        for(WebElement e:links)
////        {
////          String url = e.getAttribute("scr");
////        }
////        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
////        URL link=new URL(url);
////        HttpURLConnection httpURLConnection=(HttpURLConnection) link.openConnection();
////        httpURLConnection.setConnectTimeout(2000);
////        httpURLConnection.connect();
////        int rescode=httpURLConnection.getResponseCode();
////
////        TakesScreenshot ts=(TakesScreenshot) driver;
////        File sc=ts.getScreenshotAs(OutputType.FILE);
////        File ds=new File("");
////        FileUtils.copyFile(sc,ds);
////
////        WebElement ele =driver.findElement(By.id(""));
////        WebDriverWait wait=new WebDriverWait(driver,20);
////        wait.until(ExpectedConditions.visibilityOf(ele));
////
////        Actions a=new Actions(driver);
////        a.dragAndDrop(sc,dc);
////
////        Select s=new Select(ele);
////        s.getOptions();
////
//        JavascriptExecutor js=(JavascriptExecutor)driver;
////        js.executeScript("attribute[0],click()", ele);
////
////        Alert al=driver.switchTo().alert();
////        al.accept();
////
////        Set<String> windows=driver.getWindowHandles();
////        List<String> ids=new ArrayList<>(windows);
////
////        for(String e: ids)
////        {
////            System.out.println(e);
////            driver.switchTo().window(e).getTitle();
////        }
//
//
//
//        //iFrames
////        driver.get("https://demo.guru99.com/test/guru99home/");
////        driver.manage().window().maximize();
////        List<WebElement> iFrames=driver.findElements(By.tagName("iframe"));
////        int count=iFrames.size();
////        System.out.println(count);
////
////        driver.switchTo().frame(1);
//
//
//        //Screenshot
////        TakesScreenshot ts = (TakesScreenshot) driver;
////        File soucre = ts.getScreenshotAs(OutputType.FILE);
////        File destination = new File("C://Users//ranja//IdeaProjects//untitled//src//test.png");
////        FileUtils.copyFile(soucre, destination);
//
//
//        //Dynamic Dropdowns
////        driver.get("https://demo.guru99.com/insurance/v1/header.php");
////        driver.manage().window().maximize();
////        driver.findElement(By.id("ui-id-5")).click();
////        WebElement ele = driver.findElement(By.id("user_title"));
////        ele.click();
////        Select s = new Select(ele);
////
////        s.selectByVisibleText("Squadron Leader");
////
////       List<WebElement> options= s.getOptions();
////       for(WebElement e: options)
////       {
////           System.out.println(e.getAttribute("value"));
////       }
//
//
//        //Asserts
////        driver.get("https://demo.guru99.com/insurance/v1/header.php");
////        driver.manage().window().maximize();
////        String expurl = driver.getCurrentUrl();
////        String actual="https://demo.guru99.com/insurance/v1/header.php";
////        Assert.assertEquals(expurl,actual);
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
////        WebDriverWait wait1 = new WebDriverWait(driver,30);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@target='_blank'])[5]"))).click();
////        Set<String> windows = driver.getWindowHandles();
////        List<String> ids = new ArrayList<>(windows);
////        int size = ids.size();
////        System.out.println(size);
////        String t = ids.getFirst();
////
////        System.out.println(t);
////        driver.switchTo().window(t);
//
////        Alert a=driver.switchTo().alert();
////        a.accept();
////        a.getText();
//
//        Actions ac=new Actions(driver);
////        ac.clickAndHold().dragAndDrop().moveToElement().doubleClick().contextClick();
//
////        Select s=new Select();
////        s.getOptions()
////
//
//        TakesScreenshot ts=(TakesScreenshot) driver;
//        File sc= ts.getScreenshotAs(OutputType.FILE);
//        File ds=new File("//");
//        FileUtils.copyFile(sc,ds);
//
//        TakesScreenshot ts1=(TakesScreenshot) driver;
//        File ss=ts.getScreenshotAs(OutputType.FILE);
//
//
////        URL ul=new URL(ac);
////        HttpURLConnection httpURLConnection=(HttpURLConnection) ul.openConnection();
////        httpURLConnection.setConnectTimeout(200);
////        httpURLConnection.connect();
////        int rescode=httpURLConnection.getResponseCode();
//
////        List<WebElement> link=driver.findElements(By.tagName("a"));
////
////        for(WebElement e: link)
////        {
////           String url=e.getAttribute("href");
////        }
//
//    Set<String> win=driver.getWindowHandles();
//
////        WebDriverWait wait=new WebDriverWait(driver,10);
////        wait.until(ExpectedConditions.elementToBeClickable(By.id("/")));
//
//        driver.switchTo().frame("1");
//
//
//
//        System.out.println("Pass");
//        driver.quit();
//
//    }
//    //Broken Links
////        driver.get("https://demoqa.com/broken"); //
////        List<WebElement> links = driver.findElements(By.tagName("a"));
////        for (WebElement e : links) {
////            String url = e.getAttribute("href");
////            verifyLinks(url);
////        }
//
//    //Broken Image
////        driver.get("https://the-internet.herokuapp.com/broken_images");
////        List<WebElement> links=driver.findElements(By.tagName("img"));
////        for(WebElement e:links)
////        {
////            String imgs=e.getAttribute("src");
////            verifyLinks(imgs);
////        }
//    public static void verifyLinks(String url) {
//        try {
//            URL link = new URL(url);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
//            httpURLConnection.setConnectTimeout(2000);
//            httpURLConnection.connect();
//
//            if (httpURLConnection.getResponseCode() >= 400) {
//                System.out.println(url + " --> is a broken link");
//            }
//        } catch (Exception e) {
//        }
//    }
//}
