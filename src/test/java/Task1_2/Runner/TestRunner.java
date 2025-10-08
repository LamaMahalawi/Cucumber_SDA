package Task1_2.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Task1_2/resources/features",
        glue = "Task1_2.stepdefinitions",
        tags = "@arithmetic",
        dryRun = false
)

public class TestRunner {
}
