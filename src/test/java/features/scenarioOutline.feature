#Feature: Login
#
#  Scenario Outline: Login incorrect password
#    Given Login page
#    When User enters username "<UserName>"
#    And User enters password "<Password>"
#    And Clicks Login button
#    Then Error message should be displayed
#
#    Examples:
#      | UserName | Password |
#      | user1    | 123456   |
#      | user2    | qwerty   |

Feature: Calculator

  Scenario Outline: Adding number
    Given Calculator page
    When user enters first number as <number1>
    And user enters second number as <number2>
    Then result should be <result>


    Examples:
      | number1 | number2 | result |
      |    2    |    2    |    4   |
      |    5    |    6    |   11   |
      |   100   |    80   |  180   |