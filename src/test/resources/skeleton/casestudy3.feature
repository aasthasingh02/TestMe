Feature: case study3


In order to add item in the cart
user must sign in
user gets suggestion on typing some alphabets
user cannot go to cart without adding a product

Business Rules :
-user Should sign in first
-user gets suggestion on typing some alphabets
-user should  add atleast one product to go to cart

Questions:
-if payment password is wrong

Background:
Given user is on TestMeApp



  @tag1
  Scenario: The one where user cannot add product to cart without signin
    When user search for a product
    And user clicks on add to cart
    Then user is directed to signin page
    
  @tag2
  Scenario: The one where user search for item by typing one alphabet at a time
  When user sign in the app
  And user searchs product by one alphabet at a time
  Then user should get suggestions from app 
  
  @tag3
  Scenario: the one where user moves to cart without adding any item in it
  When user sign in the app
  And user searchs for a product and didn't add product in the cart
  Then Cart icon is not available