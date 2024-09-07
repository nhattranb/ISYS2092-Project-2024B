Feature: divide two numbers

  Scenario Outline: divide two numbers
    Given I am on the outside
    When I enter my first number as <a>
    And I enter my second number as <b>
    And I enter my choice as 4
    When I press Enter
    Then I should see the division of <a> and <b> is <div>

    Examples:
        | a | b | div |
        | 6 | 2 | 3   |
        | 21 | 3 | 7   |

  Scenario Outline: divide to zero
    Given I am on the outside
    When I enter my first number as <a>
    And I enter my second number as 0
    And I enter my choice as 1
    When I press Enter
    Then I should see an error message

    Examples:
      | a | b | div |
      | 6 | 0 | error   |