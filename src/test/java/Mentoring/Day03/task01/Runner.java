package Mentoring.Day03.task01;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Mentoring/Day03/task01/resources/features",
        glue = {"Mentoring.Day03.task01.stepdefinitions"},
        tags = "@CharacterValidation",
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