package Assignments.Assignment01.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Assignments/Assignment01/resources/features",
        glue = "Assignments.Assignment01.stepdefinitions",
        tags = "@arithmetic",
        dryRun = false
)

public class TestRunner {
}
