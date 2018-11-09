package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mesh on 11/5/2018.
 */
public class CommonPage {

    @FindBy(how=How.ID, using="contact-link")
    public static WebElement contactus;

    @FindBy(how=How.CLASS_NAME, using="login")
    public static WebElement signin;

    public void click_sign_in(){
        signin.click();
    }

    public void click_contact_us(){
        contactus.click();
    }

}
