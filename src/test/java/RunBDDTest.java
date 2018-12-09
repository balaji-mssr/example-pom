import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by RAVIVARMANS on 3/12/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/main/resources/features", format = { "pretty",
        "json:target/cucumber.json" }, tags = { "~@wip" },
        glue = {"com.es.automation.testing.web", "com.es.automation.testing.common.hooks"})
public class RunBDDTest {


}