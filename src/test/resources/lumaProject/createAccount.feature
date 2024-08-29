Feature: Create account functionality

  Scenario Outline: Happy Path
    Given user is on main page of Luma user clicks on create account button
    When user is on create account page user enters first name name as '<firstName>' and last name as '<lastName>'
    Then user enters email as '<email>' and password as '<password>' and confirms password as '<confirmPassword>'
    And user clicks on create account button and validates success message as '<successMessage>'
    Examples: test data for Luma
      | firstName | lastName | email             | password     | confirmPassword | successMessage                                     |
      | George    | Harrison | testing@yahoo.usa | Pas$w0rd!123 | Pas$w0rd!123    | Thank you for registering with Main Website Store. |
