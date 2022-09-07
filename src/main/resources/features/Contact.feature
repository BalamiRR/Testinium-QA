Feature: Testinium app Inventory feature

  User Story:
  Background: As a Posmanager, should be able to create, delete, edit a contact and change the colour of the new contact
  Given User login to test other features
  Given User is at Contact dashboard

  Scenario Outline: Verify that the user can create a new contact
    When User clicks the create button
    And User enters name "<name>"
    And User enters "<street name>"
    And User enters "<phone number>" and "<email>"
    And User clicks save button
    Then User sees the created new contact details at dashboard
    Examples:
      | name   |  street name |   phone number | email        |
      | &Dustin|  Haussman    |   +99999999999 | abcd@info.com|

  Scenario: Verify that the user can delete a contact from 2 different side
    When User clicks list section and choose the profile
    And User clicks Action to choose delete button
#    And User clicks and goes directly to the profile
#    And User clicks Action to choose delete button
    Then User sees deleted profile

  Scenario Outline: Verify that the user can edit the contact
    When User selects the profile
    And User clicks for editing button
    And User enters name "<name>"
    And User enters "<street name>"
    And User enters "<phone number>" and "<email>"
    And User clicks save button
    Then User sees the updated contact details at dashboard
    Examples:
      | name   |  street name |   phone number | email        |
      | &Dustin|  Haussman    |   +99999999999 | abcd@info.com|

  Scenario: Verify that the user can print for his due payments
    When User selects the profile
    And User clicks the print button and then select due payments
    Then User can see the downloaded file




