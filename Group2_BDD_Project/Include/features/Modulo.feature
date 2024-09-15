Feature: Modulo of two numbers

  Scenario Outline: Modulo of two numbers
    Given I am on the outside
    When I enter my first number as <a>
    And I enter my second number as <b>
    And I enter my choice as 5
    When I press Enter
    Then I should see the modulo of <a> and <b> is <mod>

    Examples:
        | a | b | mod |
        | 5 | 2 | 1   |
        | 6 | 3 | 0   |