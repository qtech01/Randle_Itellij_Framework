package Step_definitions;

import base.testBase;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by mesh on 10/23/2018.
 */
public class Common extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
//        driver.get(CONFIG.getProperty("URL"));
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        Thread.sleep(5000);

    }

    @Given("^I see a logo Banner$")
    public void i_see_a_logo_Banner() throws Throwable {
//        driver.findElement(By.id("header_logo")).isDisplayed();
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.verify_logo();

    }
}
