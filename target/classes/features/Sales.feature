Feature: .... app Sales feature

  User Story:
  Background: As a Posmanager, should be able to check and edit the Sales of the company.
  So that I can list all orders, customers in the company, I can add new customer to sales,
  I can select the customer, orders type, I can set information (tel & address)
  I can set a customer picture.

  Given User login to test other features

  Scenario: Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create
    When User click on the sales dashboard
    And User click customers button
    And User can create the customer
    Then User can save the customer

