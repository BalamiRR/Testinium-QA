@Crm
Feature: Testinium app CRM Module

  Account is: PosManager
  Background: As a Posmanager, I should be able to create and to see my pipeline and custommers on my customers from "CRM" module.
    Given User login to test other features

  Scenario: User can create pipeline in the displayed dashboard
    When User click on the crm dashboard

