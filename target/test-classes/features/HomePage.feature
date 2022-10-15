Feature: Homepage Feature Scenario

  Background: 
    Given I have launched the application
    And I enter the correct username as "standard_user" and correct Password as "secret_sauce"
    And I click on the Login Button

  Scenario: This scenario is to add the products to the cart
    When I click on Add to Cart on product "Sauce Labs Backpack"
    
    Then Basket item number should be 1
