@Calendar
Feature: Testinium app Calendar Module

  Account is: PosManager
  Background: As a Posmanager, I should be able to create and to see my meetings and events on my calendar from "Calendar" module
              For this ERP application, the calendar function is very crucial.
              Anyone in the team can contribute and plan their agenda using the calendar.
              To prevent any conflict, events should be created, edited and displayed by all team members.
  Given User login to test other features

  Scenario: Verify that all buttons work as expected at the Calendar stage
    When User click on the calendar dashboard
    And User click on day button
    And User click on week button
    And User click on month button
    Then User should see the last stage of calendar view

  Scenario: User can change display between Day-Week-Month
    When User click on the calendar dashboard
    And User click day on the calendar and display day
    Then User click month on the calendar and display month

  Scenario Outline: User can create event by clicking on daily time box
    When User click on the calendar dashboard
    And User click day on the calendar and display day
    And User click on desired date time
    Then User enters "<test>" in the box and clicks the create button

    Examples: Test name
      |test       |
      |Test test  |

  Scenario: User can edit a created event
    When User click on the calendar dashboard
    And User click day on the calendar and display day
    And User click on desired date time
    And User enters "Test" in the box and clicks the create button
    And User can see all the note
    And User can select the note
    And User can edit the information
    Then User can save all edit






