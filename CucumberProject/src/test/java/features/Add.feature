Feature: add two numbers
  As an user, I want to add two numbers so that I can get the sum of them.

    Scenario Outline: add two numbers
        Given a calculator
        When I enter my first number as {a}
        And I enter my second number as {b}
        And I enter my choice as {choice}
        When I press Enter
        Then I should see the sum of {a} and {b} is {sum}

        Examples:
            | a | b | sum |
            | 1 | 2 | 3   |
            | 2 | 3 | 5   |

    Scenario: invalid input
        Given I am on the outside
        When I enter my first number as 5
        And I enter my second number as ailqkkajqlkal
        And I enter my choice as 1
        When I press Enter
        Then I should see the error message "Invalid input, please enter a number"