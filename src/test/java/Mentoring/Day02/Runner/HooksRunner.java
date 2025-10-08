package Mentoring.Day02.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Mentoring/Day02/resources/features",
        glue = {"Mentoring.Day02.stepdefinitions","Mentoring.Day02.Hooks"},
        tags = "@ScenarioOutline",
        dryRun = false
)
public class HooksRunner {
}
