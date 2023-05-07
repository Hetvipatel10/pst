Feature: homepage search

  As a User I want to check homepage Search Result Using Different DataSet

  Scenario: User should search product and adding to cart page successfully
    Given User is on Home Page
    When Displays seven popular products by default in home page
    And I enter text Blouse in the search box
    And I click on search button
    And I should verify text "Blouse"
    And I open a detailed page on product when i clicked
    And I verify the description of the product
    And I adding the product to cart
    Then I informs the user There is 1 item in your cart.


  #  Scenario: User should see the product detailed page is displayed
    #  Given User is on Home Page
     # When Displays seven popular products by default in home page
      #And Returns the correct result when the user searches for "Blouse"
      #And I open a detailed page on product when i clicked
      #And I verify the description of the product
      #And I adding the product to cart
      #Then I informs the user There is 1 item in your cart.

  #Scenario: User should search product and adding to cart page successfully
   # Given User is on Product detail page
   # When  I open a detailed page on product when i clicked
  #  And I verify the description of the product
  #  And I adding the product to cart
   # Then I informs the user There is 1 item in your cart.
#



