package Mentoring.Day02.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Mentoring/Day02/resources/features",
        glue = "Mentoring.Day02.stepdefinitions",
        dryRun = false,
        tags = "@ScenarioOutline"
)
public class Runner {
}
