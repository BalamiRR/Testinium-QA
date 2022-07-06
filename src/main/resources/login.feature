
Feature: Upgenix app login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.

  Accounts are: PosManager, SalesManager

  #1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
  Scenario Outline: Login as user
    When user enters <username> username
    And user enters <password> password
    Then user should see the dashboard

    @SalesManager
    Examples: SalesManager's username and password
      |username               |password    |
      |salesmanager6@info.com |salesmanager|
      |salesmanager7@info.com |salesmanager|
      |salesmanager8@info.com |salesmanager|
      |salesmanager9@info.com |salesmanager|
      |salesmanager10@info.com|salesmanager|
      |salesmanager11@info.com|salesmanager|
      |salesmanager12@info.com|salesmanager|
      |salesmanager13@info.com|salesmanager|
      |salesmanager14@info.com|salesmanager|
      |salesmanager15@info.com|salesmanager|
      |salesmanager16@info.com|salesmanager|
      |salesmanager17@info.com|salesmanager|
      |salesmanager18@info.com|salesmanager|
      |salesmanager19@info.com|salesmanager|
      |salesmanager20@info.com|salesmanager|
      |salesmanager21@info.com|salesmanager|
      |salesmanager22@info.com|salesmanager|
      |salesmanager23@info.com|salesmanager|
      |salesmanager24@info.com|salesmanager|
      |salesmanager25@info.com|salesmanager|
      |salesmanager26@info.com|salesmanager|
      |salesmanager27@info.com|salesmanager|
      |salesmanager28@info.com|salesmanager|
      |salesmanager29@info.com|salesmanager|

    @PosManager
    Examples: PosManager's username and password
      |username               |password  |
      |posmanager5@info.com   |posmanager|
      |posmanager6@info.com   |posmanager|
      |posmanager7@info.com   |posmanager|
      |posmanager8@info.com   |posmanager|
      |posmanager9@info.com   |posmanager|
      |posmanager10@info.com  |posmanager|
      |posmanager11@info.com  |posmanager|
      |posmanager12@info.com  |posmanager|
      |posmanager13@info.com  |posmanager|
      |posmanager14@info.com  |posmanager|
      |posmanager15@info.com  |posmanager|
      |posmanager16@info.com  |posmanager|
      |posmanager17@info.com  |posmanager|
      |posmanager18@info.com  |posmanager|
      |posmanager19@info.com  |posmanager|
      |posmanager20@info.com  |posmanager|
      |posmanager21@info.com  |posmanager|
      |posmanager22@info.com  |posmanager|
      |posmanager23@info.com  |posmanager|
      |posmanager24@info.com  |posmanager|
      |posmanager25@info.com  |posmanager|
      |posmanager26@info.com  |posmanager|
      |posmanager27@info.com  |posmanager|
      |posmanager28@info.com  |posmanager|
      |posmanager29@info.com  |posmanager|





















