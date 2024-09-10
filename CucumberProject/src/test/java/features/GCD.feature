Feature: GCD of numbers

  Scenario: GCD of two numbers
    Given I am on the calculator page
    When I enter the first number 10
    And I enter the second number 15
    And I enter my choice as 7
    When I press Enter
    Then the result should be 5