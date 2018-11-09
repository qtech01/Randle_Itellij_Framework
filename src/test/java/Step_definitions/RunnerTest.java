package Step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mesh on 10/19/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/resources/features", format = {"pretty","json:target/cucumber.json"}, tags = {"~@ignore"})
public class RunnerTest {
}
