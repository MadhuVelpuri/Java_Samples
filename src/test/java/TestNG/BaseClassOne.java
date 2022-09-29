package TestNG;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClassOne {
    //Declared as public static to use same webdriver instance publicly
    public static WebDriver driver=null;

    //@BeforeSuite annotation describes this method has to run before all suites
    @BeforeSuite
    public void setup() throws Exception {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
    }

    @Test
    public void test1()
    {
        System.out.println("Navigated to : "+ driver.getCurrentUrl());
        driver.navigate().to(driver.getCurrentUrl()); // f5

        String title = driver.getTitle();
        Assert.assertEquals(title, "Only Testing: New Test");

    }
    //@AfterSuite annotation describes this method has to run after execution of all suites
    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
}