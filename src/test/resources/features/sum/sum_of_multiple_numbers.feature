Feature: Sum of given number

  Scenario: sum of given numbers
    Given I have entered numbers
      | 1 |
      | 1 |
      | 1 |
    When I press "add given numbers" button
    Then I should get sum of given numbers as "3"
