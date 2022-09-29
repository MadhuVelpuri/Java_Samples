package selenium_practice;

import com.sun.glass.ui.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Google_Search_filter {

    @Test
    public static void test_google_results_filter() {

        List<WebElement> list = new ArrayList<>();
        WebDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
             driver = new ChromeDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("DBS");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement res = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[@role='presentation']")));

            if(res.isDisplayed())
                list = driver.findElements(By.xpath("//ul/li[@role='presentation']"));

            int count =0;
            for(WebElement ele : list){

                if(ele.getText().contains("dbs"))
                    count++;
            }
            System.out.println(" Total links available with DBS text are : "+ count);
//            Select select = new Select(driver.findElements(By.xpath("")));


        } catch (Exception e) {
            System.out.println("Exception : "+ e.getLocalizedMessage());
        }

        finally {
            driver.quit();
        }
    }

}
