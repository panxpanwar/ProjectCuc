package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFile",
glue = "Steps" )

public class TestRunner {

}
