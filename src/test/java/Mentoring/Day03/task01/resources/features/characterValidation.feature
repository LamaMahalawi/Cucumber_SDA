
Feature: Character Validation Testing
  As a user
  I want to validate input field with 7-character restriction
  So that I can verify valid and invalid inputs work correctly

  @CharacterValidation
  Scenario Outline: Validate different text inputs
    Given user is on "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html"
    When user enters "<inputText>" in the validation field
    And user clicks validate button
    Then user should see "<expectedMessage>" message
    And user closes the browser

    Examples:
      | inputText   | expectedMessage |
      | abcdefg     | Valid Value     |
      | 1234567     | Valid Value     |
      | abc1234     | Valid Value     |
      | A1B2C3D     | Valid Value     |
      | seven77     | Valid Value     |
      | abc         | Invalid Value   |
      | 123456789   | Invalid Value   |
      | !@#%678     | Invalid Value   |
      | space s     | Invalid Value   |
      | A45         | Invalid Value   |