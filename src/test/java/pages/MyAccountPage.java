package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mesh on 11/7/2018.
 */
public class MyAccountPage {

    @FindBy(how= How.CSS, using="span")
    public static WebElement account_holder_name;

    @FindBy(how= How.CSS, using="a.logout")
    public static WebElement logoutBtn;

    public void verify_account_holder(){
//       account_holder_name.isDisplayed();
        String acc_name = account_holder_name.getText();
        System.out.println(acc_name);
    }

    public void click_logout(){
        logoutBtn.click();
    }
}
