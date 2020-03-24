
@regression @checkout

Feature:As a guest user they should be able to check out successfully
  So  that guest user  can use all functionality.
  Scenario:Guest user should able to check
  out successfully.
    Given guest user is on the Nopcommerce homepage
    When guest user click on Digitaldownlod button
    And guest user can click on add to cart
    And guest user can click on shipping cart
    And guest user can tick on terms box
    And guest user can click on checkout
    And guest user can click on checkout as guest
    And guest user can enter all compulsory field
    And guest user can click o n continue
    And guest user can Enter Payment information
    And guest user can click on payment button
    And guest user can click on conform button
    Then guest user can buy product successfully and see message