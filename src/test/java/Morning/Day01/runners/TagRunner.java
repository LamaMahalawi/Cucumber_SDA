package Morning.Day01.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@positiveSignIn3 or @positiveSignIn2",
        dryRun = false
)
    public class TagRunner {
    }
