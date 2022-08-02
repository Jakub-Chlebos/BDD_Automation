Feature: Authentication to e-shop
  As an user
  I want to sing in to e-shop, so that I can continue shopping

  Background:
    Given Home page is opened
    When I click Sign in link in top menu

  Scenario: Authentication - positive flow
    And I fill login field "testUser12345@test.pl"
    And I fill password field "password1234"
    And I click Sign in button
    Then I can see page for authenticated user

#  Scenario: Authentication - missing data
#    And I click Sign in button
#    Then I can see message "An email address required"
#
#  Scenario: Authentication - empty password
#    And I fill login field "testUser1@test.test.pl"
#    And I click Sign in button
#    Then I can see message "Password is required"


  Scenario Outline: Authetnication - negative flow
    And I fill login field "<emailAddress>"
    And I fill password field "<password>"
    And I click Sign in button
    Then I can see message "<expectedErrorMessage>"
    Examples:
      | emailAddress | password | expectedErrorMessage          |
      |              |          | An email address is required. |
      | invalid      | test     | Invalid email address.        |
      | test.test.pl | test     | Invalid email address.        |
      | test@test.pl |          | Password is required.         |
      | test@test.pl | 1        | Invalid password.             |
      | test@test.pl | 111111   | Authentication failed.        |
