package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testBase {
    public static Properties CONFIG=null;
    public static WebDriver driver=null;
    public int random;

    public void initialize() throws IOException {
        if (driver == null) {


               CONFIG= new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
            CONFIG.load(fn);

            //Initialize the webdriver

            if (CONFIG.getProperty("browser").equals("firefox")) {
                driver = new FirefoxDriver();


            } else if (CONFIG.getProperty("browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();


            } else if (CONFIG.getProperty("browser").equals("IE")) {
                System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();

            }

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

    }
}

