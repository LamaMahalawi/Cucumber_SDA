@hooksFeature
Feature: sign in sauce demo
  As a user
  I want to sign in
  so that I can use the sauce demo application

  @hooks @SauceDemo
  Scenario: Sign in with valid credentials
    Given I am on sauceDemo application
    When I enter "standard_user" as username
    And I enter "secret_sauce" as password
    And I click on sign in button
    Then I should be redirected to Products page
    And I should see product inventory@addTodo
Feature: todo list feature

  @ToDoList
  Scenario: we can add new todos
    Given user goes to url "https://webdriveruniversity.com/To-Do-List/index.html"
    When user enters new todos
      | Prepare Breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
      | Get Up                   |
      | Go to school             |
    Then user closes the browser