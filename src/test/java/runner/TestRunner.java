package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features" ,
                 glue = "org.test.stepdefs",
                 tags = "@Dummy",
                 plugin = {"pretty",
                         "html:target/cucumber",
                         "json:target/cucumber.json"}
)


public class TestRunner {

}
