Feature: LCM of numbers

  Scenario: LCM of two numbers
    Given I am on the calculator page
    When I enter the first number 10
    And I enter the second number 15
    And I enter my choice as 8
    When I press Enter
    Then I should see the result as 30