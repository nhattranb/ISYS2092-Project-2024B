Feature: divide two numbers

  Scenario: divide two numbers
    Given I have entered 6 into the calculator
    And I have entered 2 into the calculator
    And I entered the choice as 4
    When I press Enter
    Then the result should be 3 on the screen

  Scenario: divide to zero
    Given I have entered 6 into the calculator
    And I have entered 0 into the calculator
    And I entered the choice as 4
    When I press Enter
    Then I should see an error message on the screen