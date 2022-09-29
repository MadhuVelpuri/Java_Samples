package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    WebDriver driver;
  //  @Test
    public void takeScreenshot() throws IOException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");

        driver = new ChromeDriver();


        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("google.png"));
    }

    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");

        driver = new ChromeDriver();


        driver.get("https://www.google.com");
        try{
            driver.findElement(By.xpath("INVALID XPATH")).sendKeys("asdasdas");
        }catch(Exception e){
            System.out.println("hi");
        }
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
