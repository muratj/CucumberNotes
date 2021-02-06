Feature: DataTable practice

  Scenario: DataTable Scenario
    Given Some registration page
    When User enters following user details
      | Kevin   | McAlister | 1992  | 9927384732 |
      | Jenifer | Lopez     | 1990  | 9926426362 |
      | Elon    | Musk      | 1975  | 6425378482 |
    Then User registration should be successful