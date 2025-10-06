package Assignments.Assignment01.stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ArithmeticStepDefs {

    int num1;
    int num2;
    int result;
    String errorMessage;

    @Given("I have two positive numbers {int} and {int}")
    public void i_have_two_positive_numbers_and(Integer n1, Integer n2) {
        num1 = n1;
        num2 = n2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        Assert.assertEquals(expected.intValue(), result);
        System.out.println("Result: " + result);
    }

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(Integer n1, Integer n2) {
        num1 = n1;
        num2 = n2;
    }

    @When("I subtract the second number from the first")
    public void i_subtract_the_second_number_from_the_first() {
        result = num1 - num2;
    }

    @When("I divide the first number by the second")
    public void i_divide_the_first_number_by_the_second() {
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            errorMessage = "Cannot divide by zero";
        }
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {
        Assert.assertEquals("Cannot divide by zero", errorMessage);
        System.out.println("Error message: " + errorMessage);
    }

    @But("the program should not crash")
    public void the_program_should_not_crash() {
        System.out.println("Program handled division by zero safely.");
    }
}