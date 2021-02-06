@All
Feature: Practice tags

  Scenario: Write tags with @ symbol
    Given I am on feature file
    When I want to run my code with groups
    Then I have to use @GroupName annotation
    And We can call them from testRunner class or terminal

  @Smoke
  Scenario: This is example with Smoke tag
    Given Some given 1
    When Some when 1
    Then Some then 1
  @Smoke @US-1001 @Epic-100
  Scenario: This is example with Smoke tag
    Given Some given 2
    When Some when 2
    Then Some then 2

  @Regression
  Scenario: This is example with Regression tag
    Given Some given 3
    When Some when 3
    Then Some then 3