Feature: Amazon Search

  Scenario: Search a Product
    Given I am on the Amazon main page search field
    When I search for a product with "Apple Macbook Pro" and price 1000
    Then Search results should be displayed