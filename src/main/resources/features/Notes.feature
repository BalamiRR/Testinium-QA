
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

  Scenario: Verify that User can discard and  edit the Notes



  Scenario: Verify that User can move element from New stage to Today stage




