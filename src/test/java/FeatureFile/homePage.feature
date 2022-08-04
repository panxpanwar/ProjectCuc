#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.


Feature: Verify Home Page

  Scenario: Verify total world Population
    Given I naviagte to worldometer home page
    And I click  on world population link
    Then System displays worlds population



  Scenario Outline: Read data from example and write in comment
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
