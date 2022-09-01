Feature: Testinium app Inventory feature

  User Story:
  Background: As a Posmanager, should be able to create, delete, edit a contact and change the colour of the new contact

    Given User login to test other features


    Scenario Outline: Verify that the user can create a new contact and edit
      When User is at Contact dashboard
      And User select the profile to update
      And User clicks the edit button
      And User enters name "<name>"
      And User enters "street name"
      And User enters "phone number" and "email"
      And User clicks save button
      Then User sees the updated contact details at dashboard
      Examples:
        | name |    street name |   phone number |         email|


    Scenario: Verify that the user can delete a contact from 2 different side
      When User is at Contact dashboard
      And User clicks list section and choose the profile
      And User clicks Action to choose delete button
      And User clicks and goes directly to the profile
      And User clicks Action to choose delete button
      Then User comes back to the dashboard to see if profile is deleted

    Scenario: Verify that the user can change the colour of the new created contact.


    Scenario: Verify that the user can print for his due payments

