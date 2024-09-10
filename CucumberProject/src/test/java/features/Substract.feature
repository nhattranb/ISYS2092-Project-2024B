Feature: subtract two numbers
  As an student, I want to subtract two numbers so that I can learn how to subtract numbers.

    Scenario Outline: subtract two numbers
      Given I am on the outside
      When I enter my first number as <a>
      And I enter my second number as <b>
      And I enter my choice as 2
      When I press Enter
      Then I should see the subtraction of <a> and <b> is <sub>

    Examples:
        | a | b | sub |
        | 10 | 5 | 5 |
        | 5 | 10 | -5 |
