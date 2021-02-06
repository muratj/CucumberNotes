Feature: Login

  Scenario Outline: Login incorrect password
    Given Login page
    When User enters username "<UserName>"
    And User enters password "<Password>"
    And Clicks Login button
    Then Error message should be displayed



    Examples:
      | UserName | Password |
      | user1    | 123456   |
      | user2    | qwerty   |
