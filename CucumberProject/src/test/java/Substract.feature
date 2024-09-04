Feature: subtract two numbers
  As an student, I want to subtract two numbers so that I can learn how to subtract numbers.

    Scenario: subtract two numbers
        Given I have entered 5 into the calculator
        And I have entered 3 into the calculator
        When I press subtract
        Then the result should be 2 on the screen

    Scenario: subtract two numbers
        Given I have entered 10 into the calculator
        And I have entered 5 into the calculator
        When I press subtract
        Then the result should be 5 on the screen