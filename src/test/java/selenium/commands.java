package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class commands {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/java/selenium/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void verifyPageTitle() {
        /* Locators in Selenium :
        ID,Name,ClassName,LinkText,Partial LinkText,TagName,CssSelector,XPath
        */

       /* Get Commands
        driver.getTitle();
        driver.getPageSource();
        driver.getCurrentUrl();
        driver.getWindowHandle();
        driver.getWindowHandles();*/

        /*Navigate commands
        These commands allow you to  refresh,go-into and switch back and forth between different web pages.
        driver.navigate().to()
        driver.navigate().refresh()
        driver.navigate().back()
        driver.navigate().forward() */
        /*Switching between Frames
        driver.switchTo().frame("");
        driver.switchTo().defaultContent();*/

        /*driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();*/

        /* Waits in Selenium
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));*/

        /* CSS Locators
        Tag and ID	css=tag#id	css=input#email
        Tag and Class	css=tag.class	css=input.inputtext
        Tag and Attribute	css=tag[attribute=value]    css=input[name=lastName]
        Tag, Class, and Attribute	css=tag.class[attribute=value]	css=input.inputtext[tabindex=1]*/

        /* Window Handles


         String mainWindowHandle = driver.getWindowHandle();
         driver.findElement(By.id("windowButton")).click();
         Set<String> s1 = driver.getWindowHandles();
         System.out.println("Child window handle is" + s1);
         Iterator<String> i1 = s1.iterator();
         while (i1.hasNext()) {
          String ChildWindow = i1.next();
          if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
              driver.close();
              System.out.println("Child window closed");
           }}
         driver.switchTo().window(mainWindowHandle);
         */

        /* Capturing Screenshots*
       TakesScreenshot scrShot =((TakesScreenshot) driver);
       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
       File DestFile=new File(fileWithPath);
       FileUtils.copyFile(SrcFile, DestFile)*/

        /*Select Class
        Select se = new Select(driver.findElement(By.xpath("")));
        se.   selectByIndex(1);
        se.selectByValue("");
        se.selectByVisibleText("");  */

        /* Actions Class

          Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                        mouseOverHome.perform();

                  Actions act=new Actions(driver);
                  act.dragAndDrop(From, To).build().perform();
         */









        System.out.println();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
