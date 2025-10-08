package Assignments.Assignment1.Task01;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/Assignments/Assignment1/Task01/resources/features",
        glue = "Assignments.Assignment1.Task01.stepdefinitions",
        tags = "@NotesManagement",
        plugin = {
                "pretty",
                "html:reports/html-reports/cucumber.html",
                "json:reports/json-reports/cucumber.json",
                "junit:reports/xml-reports/cucumber.xml"
        },
        dryRun = false
)
public class Runner {
}