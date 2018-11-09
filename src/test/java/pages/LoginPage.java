package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mesh on 11/5/2018.
 */
public class LoginPage {

    @FindBy(how= How.ID, using="email")
    public static WebElement myEmail;

    @FindBy(how= How.ID, using="passwd")
    public static WebElement mypassword;

    @FindBy(how= How.LINK_TEXT, using="Forgot your password?")
    public static WebElement forgotpssw;

    @FindBy(how= How.NAME, using="SubmitLogin")
    public static WebElement loginBtn;

    @FindBy(how= How.ID, using="email_create")
    public static WebElement register_email;

    public void type_email(String email){
        myEmail.sendKeys(email);
    }

    public void type_password(String password){
        mypassword.sendKeys(password);
    }

    public void click_Login(){
        loginBtn.click();
    }

    public void click_forgot_password(){
        forgotpssw.click();
    }

    public void type_register_email(String regemail){
        register_email.sendKeys(regemail);
    }


}
