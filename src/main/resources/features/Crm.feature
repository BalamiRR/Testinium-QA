@Smoke
Feature: Testinium app CRM Module

  Account is: PosManager

  Background: As a Posmanager, I should be able to create and to see my pipeline and custommers on my customers from "CRM" module.
    Given User login to test other features

  Scenario: User can create pipeline in the displayed dashboard
    When User click on the crm dashboard
    And User click on the pipeline button
    And User can create the new pipeline
    And User can see the total price
    Then User can see new pipeline

  Scenario Outline: User can change information in dashboard
    When User click on the crm dashboard
    And User can change any user's information like "<opportunity>" , "<revenue>" and "<probability>"
    And User can save information
    Then User can verify the information

    Examples: Expected name
      | opportunity | revenue | probability |
      | Test2       | 30      | 2           |

  Scenario: User can change the situation in progress
    When User click on the crm dashboard
    And User can drag and drop the pipeline
    Then User can see the new changes in progress

  Scenario: User can register new customer and can print the profile
    When User click on the crm dashboard
    And User can register new customer
    Then User can print the profile


