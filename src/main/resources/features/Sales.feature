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
    And User can save the customer
    Then User can find his name "Lucas" from search bar

  Scenario: Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User click on the sales dashboard
    And User click customers button
    And User can create new customer
    Then User can get the error

  Scenario Outline: Verify that after creating a new customer, the page title includes the customer name.
    When User click on the sales dashboard
    And User click customers button
    Then User can find his name "<name>" from search bar

    Examples: Employee's name
      | name  |
      | Lucas |
    
