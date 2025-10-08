@arithmetic
Feature: Arithmetic Operations
  As a user
  I want to perform basic arithmetic operations
  So that I can verify addition, subtraction, and division behavior

  @smoke @positive
  Scenario: Addition of two positive numbers
    Given I have two positive numbers 10 and 13
    When I add the numbers
    Then the result should be 23

  @smoke @negative
  Scenario: Subtraction resulting in a negative number
    Given I have two numbers 3 and 8
    When I subtract the second number from the first
    Then the result should be -5

  @negative
  Scenario: Division by zero (error case)
    Given I have two numbers 10 and 0
    When I divide the first number by the second
    Then an error message should be displayed
    But the program should not crash