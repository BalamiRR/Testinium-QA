@LogOut
Feature: Testinium app logout feature

  User Story:
  As a user, I should be able to logout in login page.

  Accounts are: PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the upgenix login page

  #1- User can log out and ends up in login page.
  @UPGN-291
  Scenario Outline: For the scenarios in the feature file, user is expected to be on logout page
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the login button
    And User should see the dashboard
    And User click Log out option
    Then User should see the login dashboard
    @SalesManager
    Examples: SalesManager's username and password
      |username               |password    |
      |salesmanager7@info.com |salesmanager|
      |salesmanager8@info.com |salesmanager|
      |salesmanager9@info.com |salesmanager|

    @PosManager
    Examples: PosManager's username and password
      |username               |password    |
      |posmanager5@info.com   |posmanager  |
      |posmanager6@info.com   |posmanager  |
      |posmanager7@info.com   |posmanager  |


  #2- The user can not go to the home page again by clicking the step f button after successfully logged out.
  @UPGN-292
  Scenario Outline: For the scenarios in the feature file, user is expected to be clicked the step back button on logout page
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the login button
    And User should see the dashboard
    And User click Log out option
    And User should see the login dashboard
    Then User can not click the step back button to go the home page

    @SalesManager
    Examples: SalesManager's username and password
      |username               |password    |
      |salesmanager7@info.com |salesmanager|
      |salesmanager8@info.com |salesmanager|
      |salesmanager9@info.com |salesmanager|

    @PosManager
    Examples: PosManager's username and password
      |username               |password    |
      |posmanager5@info.com   |posmanager  |
      |posmanager6@info.com   |posmanager  |
      |posmanager7@info.com   |posmanager  |

