Feature: Testinium app Inventory feature

  User Story:
  Background: As a Posmanager, should be able to check and edit the Inventory of the company.
  So that I can list all products in the company, I can add new products to inventory,
  I can select the Product type, I can set prices (cost & sales), I can give a barcode to the product.
  I can set a product picture.

  Given User login to test other features

  Scenario: Verify that User can reach New Products Form by clicking Inventory --> Products --> Create
    When Logged user clicks on Inventory Module
    And User clicks on Product module
    And User see the products
    And User clicks create button
    Then User should see the dashboard

  Scenario: Verify that after creating a Product, the page title includes the Product name.
    When Logged user clicks on Inventory Module
    And User clicks on Product module
    And User clicks create button
    And User enters Product Name
    And User clicks the save button
    Then User sees the created Product

  Scenario:Verify that if Product name field leaves blank, an error message 'The following fields are invalid:' is appeared
    When Logged user clicks on Inventory Module
    And User clicks on Product module
    And User clicks create button
    And User clicks the save button
    Then User should see the error

  Scenario: Verify that the user should be able to see created Product is listed after clicking the Products module.
    When Logged user clicks on Inventory Module
    And User clicks on Product module
    And User clicks create button
    And User enters Product Name
    And User clicks the save button
    And User clicks on Product module
    Then User should see the title includes the Product Name



