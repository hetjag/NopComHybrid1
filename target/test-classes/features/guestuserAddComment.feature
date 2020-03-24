@addNewComment   @regression
Feature:As a guest user they can add new comment in nopcommerce,
  Scenario:Guest user should able to add a new comment in nopcommerce successfully

    Given I am on the NopeCommerce  homepage
    When I navigate to new comments
    And  I fills comment fields
    And I click on new comment button
    Then comment should be added and message display <News comment is successfully added.>