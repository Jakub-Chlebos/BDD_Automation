Feature: Dress page visibility and offer verification
  As a user
  I want to open Shop dress page to see offer and available options for customer

  Background:
    Given Home page is opened
    And I click on Dress page link

  Scenario: Comparing prizes of 3 different dresses
    When I add to cart "Printed Chiffon Dress"
    And I add to cart "Printed Dress"
    And I add to cart "Printed Summer Dress"
    Then Shopping card is opened
    And I see dress name and price
      | name                  | price |
      | Printed Chiffon Dress | 16.40 |
      | Printed Dress         | 26.00 |
      | Printed Summer Dress  | 28.98 |
    And I can see quantity of dresses equals 3
