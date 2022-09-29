package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable_MaxValue {

    public static void main(String[] args) throws ParseException {
        Double dupValue = 0.0, finalValue = 0.0 ;
        String value;
       // WebDriver driver;
        ChromeDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        Dimension d = new Dimension(960,540);
        driver.manage().window().setSize(d);
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Find the table in the page.

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

        //No of rows
        List tRows = table.findElements(By.xpath("//table[@class='dataTable']//tbody/tr"));
        //No of columns
        List tColumns = table.findElements(By.xpath("//table[@class='dataTable']//tr/th"));

        for (int i=0;i<tRows.size();i++){

            value = table.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+(i+1)+"]/td[4]")).getText();

            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            Number nm = numberFormat.parse(value);
            value = nm.toString();

            dupValue = Double.parseDouble(value);


            if(dupValue>finalValue)
            finalValue = dupValue;

        }

        System.out.println("Max value in the table is  : "+ finalValue);

        driver.quit();

    }
}
