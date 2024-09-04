Feature: add two numbers
  As an user, I want to add two numbers so that I can get the sum of them.

    Scenario: add two numbers
        Given I am on the outside
        When I enter my first number as 5
        And I enter my second number as 3
        And I enter my choice as 1
        Then I should see the sum of 5 and 3 is 8

    Scenario: wrong results?
        Given I am on the outside
        When I enter my first number as 5
        And I enter my second number as 3
        And I enter my choice as 1
        Then I should not see the sum of 5 and 3 is 9