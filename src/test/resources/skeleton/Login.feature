
Feature: Login

In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can do the login
 - user should provide all the necessary details on registration
 
 Questions:
 -Can guest user purchase a product
 Background:
 Given Larry is on  login page

 Scenario: user can do the successful login
 Given Larry is on login page
 When  Larry enters correct credentials
 Then   Larry is on the home page
   
   @data-driven
   Scenario:The one where the user change some of  the data and place the order
   When Larry increase the headphone quantity by  2
  And continue for checkout
  And change the shipping address to a new address as "Pune"
  Then the product should be delivered to the new address
  
  @data-outline
  Scenario Outline:user can do successful login with different data
  
  When user enters correct password as "<username>"
  And user enters correct password as "<password>"
  Then user can do successful login
  Examples:
  |username|Password456|
  |Lalitha|Password123|