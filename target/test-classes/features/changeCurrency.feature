
@changeCurrency @regression
Feature:As a user I should able to change currency,
  so that I can use a different currency
  Scenario:I should able to change currency successfully

    Given I am on the NopeCommerce  homepage
    When I change currency to USD
    Then I can see all the prices have change to USD