package selenium_practice;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.exceptions.UnirestException;
import junit.framework.Assert;


class LoginFormTest {

    static String username = "sneha.bhattaram%40imaginea.com"; // Your username
    static String authkey = "u21790ec2574ca8a";  // Your authkey
    String testScore = "unset";

    public static void main(String[] args) throws Exception {
        LoginFormTest myTest = new LoginFormTest();

        DesiredCapabilities caps = new DesiredCapabilities();
//
//        caps.setCapability("name", "Login Form Example");
//        caps.setCapability("build", "1.0");
//        caps.setCapability("browserName", "Chrome");
//        caps.setCapability("version", "72");
//        caps.setCapability("platform", "Windows 10");
//        caps.setCapability("screenResolution", "1366x768");
//        caps.setCapability("record_video", "true");
//        caps.setCapability("record_network", "false");

//For Mobile


        caps.setCapability("name", "Login Form Mobile Example");
        caps.setCapability("build", "1.0");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("platFormVersion", "10.0");
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceOrientation","portrait");
        caps.setCapability("deviceName","Pixel 4");
//        caps.setCapability("screenResolution", "1366x768");
        caps.setCapability("record_video", "true");
        caps.setCapability("record_network", "false");
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://" + username + ":" + authkey +"@hub.crossbrowsertesting.com:80/wd/hub"), caps);
        System.out.println(driver.getSessionId());

        // we wrap the test in a try catch loop so we can log assert failures in our system
        try {

            // load the page url
            System.out.println("Loading Url");
            driver.get("http://crossbrowsertesting.github.io/login-form.html");
            // maximize the window - DESKTOPS ONLY
            //System.out.println("Maximizing window");
            //driver.manage().window().maximize();

            // complete a short login form
            // first by entering the username
            System.out.println("Entering username");
            driver.findElement(By.name("username")).sendKeys("tester@crossbrowsertesting.com");

            // then by entering the password
            System.out.println("Entering password");
            driver.findElement(By.name("password")).sendKeys("test123");

            // then by clicking the login button
            System.out.println("Logging in");
            driver.findElement(By.cssSelector("div.form-actions > button")).click();

            // let's wait here to ensure the page has loaded completely
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logged-in-message\"]/h2")));

            // Let's assert that the welcome message is present on the page.
            // if not, an exception will be raised and we'll set the score to fail in the catch block.
            String welcomeMessage = driver.findElement(By.xpath("//*[@id=\"logged-in-message\"]/h2")).getText();
            Assert.assertEquals("Welcome tester@crossbrowsertesting.com", welcomeMessage);

            // if we get to this point, then all the assertions have passed
            // that means that we can set the score to pass in our system
            myTest.testScore = "pass";
        }
        catch(AssertionError ae) {

            // if we have an assertion error, take a snapshot of where the test fails
            // and set the score to "fail"
//            String snapshotHash = myTest.takeSnapshot(driver.getSessionId().toString());
//            myTest.setDescription(driver.getSessionId().toString(), snapshotHash, ae.toString());
            myTest.testScore = "fail";
        }
        finally {

            System.out.println("Test complete: " + myTest.testScore);

            // here we make an api call to actually send the score
//            myTest.setScore(driver.getSessionId().toString(), myTest.testScore);

            // and quit the driver
            driver.quit();
        }
    }
//
//    public JsonNode setScore(String seleniumTestId, String score) throws UnirestException {
//        // Mark a Selenium test as Pass/Fail
//        HttpResponse<JsonNode> response = Unirest.put("http://crossbrowsertesting.com/api/v3/selenium/{seleniumTestId}")
//                .basicAuth(username, authkey)
//                .routeParam("seleniumTestId", seleniumTestId)
//                .field("action","set_score")
//                .field("score", score)
//                .asJson();
//        return response.getBody();
//    }

//    public String takeSnapshot(String seleniumTestId) throws UnirestException {
//        /*
//         * Takes a snapshot of the screen for the specified test.
//         * The output of this function can be used as a parameter for setDescription()
//         */
//        HttpResponse<JsonNode> response = Unirest.post("http://crossbrowsertesting.com/api/v3/selenium/{seleniumTestId}/snapshots")
//                .basicAuth(username, authkey)
//                .routeParam("seleniumTestId", seleniumTestId)
//                .asJson();
//        // grab out the snapshot "hash" from the response
//        String snapshotHash = (String) response.getBody().getObject().get("hash");
//
//        return snapshotHash;
//    }
//
//    public JsonNode setDescription(String seleniumTestId, String snapshotHash, String description) throws UnirestException{
//        /*
//         * sets the description for the given seleniemTestId and snapshotHash
//         */
//        HttpResponse<JsonNode> response = Unirest.put("http://crossbrowsertesting.com/api/v3/selenium/{seleniumTestId}/snapshots/{snapshotHash}")
//                .basicAuth(username, authkey)
//                .routeParam("seleniumTestId", seleniumTestId)
//                .routeParam("snapshotHash", snapshotHash)
//                .field("description", description)
//                .asJson();
//        return response.getBody();
//    }
}