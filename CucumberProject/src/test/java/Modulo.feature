Feature: Modulo of two numbers

  Scenario: Modulo of two numbers
    Given I have two numbers 10 and 3
    When I calculate the modulo of the two numbers
    Then the result should be 1

  Scenario: invalid input
    Given I have two numbers 10 and 0
    When I calculate the modulo of the two numbers
    Then the result should be invalid input