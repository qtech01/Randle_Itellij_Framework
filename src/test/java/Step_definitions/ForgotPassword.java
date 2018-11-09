package Step_definitions;

import base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

/**
 * Created by mesh on 10/13/2018.
 */
public class ForgotPassword extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @And("^I click forgot password Link$")
    public void iClickForgotPasswordLink() throws Throwable {
        driver.findElement(By.linkText("Forgot your password?")).click();
    }

    @And("^I click retrieve password button$")
    public void iClickRetrievePasswordButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'form_forgotpassword\']/fieldset/p/button/span/i")).click();
    }

    @Then("^I should see a confirmation message$")
    public void iShouldSeeAConfirmationMessage() throws Throwable {
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div/p")).getText();
        System.out.println(ActualMessage);

    }

    @And("^I enter unregistered user email \"([^\"]*)\" details$")
    public void iEnterUnregisteredUserEmailDetails(String value) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(value);

    }

    @Then("^I should see an error message$")
    public void iShouldSeeAnErrorMessage() throws Throwable {
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\'center_column\']/div/div/ol/li")).getText();
        System.out.println(ActualMessage);

    }

    @And("^I click back to login button$")
    public void iClickBackToLoginButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li/a/span")).click();
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)","");
        driver.manage().deleteAllCookies();
//        Thread.sleep(3000);
        driver.quit();

    }
}
