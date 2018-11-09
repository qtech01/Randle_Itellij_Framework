package Step_definitions;

import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by mesh on 10/12/2018.
 */
public class Login extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @When("^I click SignIn button$")
    public void i_click_SignIn_button() throws Throwable {
//        driver.findElement(By.className("login")).click();
        CommonPage commonPage = PageFactory.initElements(driver, CommonPage.class);
        commonPage.click_sign_in();

    }

    @When("^I enter email address in the email input field$")
    public void i_enter_email_address_in_the_email_input_field() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("bradj4244@gmail.com");


    }

    @When("^I enter password in the password input field$")
    public void i_enter_password_in_the_password_input_field() throws Throwable {
//        code to scroll
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)","");
        driver.findElement(By.id("passwd")).sendKeys("Tomorrow1");

    }

    @When("^I click the Login Button$")
    public void i_click_the_Login_Button() throws Throwable {
//        driver.findElement(By.id("SubmitLogin")).click();
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_Login();

    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
//        String NameofUser = driver.findElement(By.cssSelector("span")).getText();
//        System.out.println(NameofUser);
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.verify_account_holder();


    }

    @Then("^I Sign out$")
    public void i_Sign_out() throws Throwable {
//        driver.findElement(By.className("logout")).click();
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.click_logout();
        driver.manage().deleteAllCookies();
        driver.close();

    }

    @And("^I enter user email \"([^\"]*)\" details$")
    public void iEnterUserEmailDetails(String email) throws Throwable {
//      driver.findElement(By.id("email")).sendKeys(value);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email(email);
    }

    @And("^I enter user password \"([^\"]*)\" details$")
    public void iEnterUserPasswordDetails(String password ) throws Throwable {
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)","");
//        driver.findElement(By.id("passwd")).sendKeys(value);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_password(password);
        Thread.sleep(2000);

    }

    @Then("^I should see an error \"([^\"]*)\" message details$")
    public void iShouldSeeAnErrorMessageDetails(String ErrorMessage) throws Throwable {
        String ExpectedMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]/ol/li")).getText();
        System.out.println(ActualErrorMessage);
        Assert.assertEquals(ExpectedMessage,ActualErrorMessage);
        driver.manage().deleteAllCookies();
//        Thread.sleep(2000);
        driver.quit();

    }



}
