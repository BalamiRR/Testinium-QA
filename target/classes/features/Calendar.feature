@Calendar
Feature: Upgenix app Calendar Module

  Account is: PosManager
  Background: As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module
              For this ERP application, the calendar function is very crucial.
              Anyone in the team can contribute and plan their agenda using the calendar.
              To prevent any conflict, events should be created, edited and displayed by all team members.

  Given User is on the upgenix login page
  Scenario: Verify that all buttons work as expected at the Calendar stage
    When User clicks on the calendar dashboard
    And User clicks on day button
    And User clicks on week button
    And User clicks on month button
    Then User should see the last stage of calendar view



