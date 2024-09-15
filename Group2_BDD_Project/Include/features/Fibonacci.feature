Feature: Fibonacci number

  Scenario: Fibonacci of numbers
    Given a calculator
    When I enter my first number as \{a}
    And I enter my second number as \{b}
    And I enter my choice as 9
    Then I should get the fibonacci of the two numbers as \{result}