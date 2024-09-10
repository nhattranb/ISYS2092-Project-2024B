Feature: number to the power of another number

  Scenario: power function
    Given I am on the outside
    When I enter my first number as <a>
    And I enter my second number as <b>
    And I enter my choice as 6
    When I press Enter
    Then I should see the power of <a> and <b> is <pow>