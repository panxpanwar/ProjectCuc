package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFile",
glue = {"Steps", "Manager"},
plugin = {"pretty","html:target/cucumber-reports.html"}, 
monochrome = true)

public class TestRunner {

}
