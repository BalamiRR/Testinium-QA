Feature: Testinium app login feature
  User Story:
  Background: As a user, I can create new Notes and see the created notes on the list
             I can discard and  edit the Notes
             I can move element from New stage to Today stage

  Accounts are: PosManager
    Given User login to test other features

  Scenario: Verify that User can create new Notes and see the created notes on the list
    When User clicks the Notes module
    And User clicks create button in Notes module
    And User enters a tag name
    And User enters description
    And User clicks save button
    Then User sees the created new notes

  Scenario: Verify that User can edit the Notes
    When User clicks the Notes module
    And User clicks the edit button
    And User enters new description
    And User clicks save button
    And User enters new description
    Then User should see the Notes list

  Scenario: Verify that User can move element from New section to Today section
    When User clicks the Notes module
    And User move element from New section to Today section
    Then User sees Today new added element
