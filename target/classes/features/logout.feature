@Logout
Feature: Upgenix app logout feature
  User Story:
  As a user, I should be able to logout in login page.

  Accounts are: PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the upgenix logout page

  @K
  #1- User can log out and ends up in login page.
  Scenario Outline: For the scenarios in the feature file, user is expected to be on logout page
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the login button
    And User should see the dashboard
    Then User clicks the account icon and then click Log out option
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




#2- The user can not go to the home page again by clicking the step back button after successfully logged out.