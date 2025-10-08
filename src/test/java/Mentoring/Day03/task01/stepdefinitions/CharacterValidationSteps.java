package Mentoring.Day03.task01.stepdefinitions;

import Mentoring.Day03.task01.page.CharacterValidationPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;

public class CharacterValidationSteps {

    CharacterValidationPage page = new CharacterValidationPage();

    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();
    }

    @When("user enters {string} in the validation field")
    public void user_enters_in_the_validation_field(String text) {
        page.enterText(text);
    }

    @When("user clicks validate button")
    public void user_clicks_validate_button() {
        page.clickValidate();
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String expectedMessage) {
        String actualMessage = page.getResultMessage();
        System.out.println("Expected: " + expectedMessage);
        System.out.println("Actual: " + actualMessage);
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.quitDriver();
    }
}