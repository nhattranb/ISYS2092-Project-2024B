Feature: multiply two numbers
  As an user, I want to multiply two numbers so that I can get the result of the multiplication

    Scenario Outline: multiply two numbers
      Given I am on the outside
      When I enter my first number as <a>
      And I enter my second number as <b>
      And I enter my choice as 3
      When I press Enter
      Then I should see the multiplication of <a> and <b> is <mul>

    Examples:
        | a | b | mul |
        | 2 | 3 | 6   |
        | 4 | 5 | 20  |

