@Login
Feature: Testinium app login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts.

  Accounts are: PosManager, SalesManager

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the upgenix login page

  #1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
  @UPGN-286
  Scenario Outline: Users log in with valid credentials
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the login button
    Then User should see the dashboard

    @SalesManager
    Examples: SalesManager's username and password
      |username               |password    |
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


  #2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
  @UPGN-287
  Scenario Outline: Users log in with invalid email or invalid password credentials
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the login button
    Then User sees error message

    @SalesManager
    Examples: SalesManager's username and password
      |username               |password    |
      |salesmanager6@info.com |saLesManager|
      |salesm27aners@info.com |salesmanager|
      |salesmanager8@info.com |sale@g@0fz8r|
      |salesmanage28@info.com |saleSM2na2er|
      |salesmanager10@info.com|SaLeSMaNaGeR|

    @PosManager
    Examples: PosManager's username and password
      |username               |password   |
      |posmanager5@info.com   |posmanager1|
      |posmanagerr6@info.com  |posmanager |
      |posmanger8@info.com    |posmager   |
      |posmanager8@info.com   |po2sm232ger|
      |posmanager9@info.com   |posFkc@ma#$|


  #3- "Please fill out this field" message should be displayed if the password or username is empty
  @UPGN-288
  Scenario Outline:Users log in with invalid email or invalid password credentials
    When User enters "<password>" username
    And User clicks the login button
    Then User sees "Veuillez renseigner ce champ." message

    @SalesManager
    Examples: SalesManager's username and password
      |password    |
      |salesmanager|

    @PosManager
    Examples: PosManager's username and password
      |password    |
      |posmanager  |


  #4- User land on the ‘reset password’ page after clicking on the "Reset password" link

  #5-User should see the password in bullet signs by default
  @UPGN-289
  Scenario Outline: User should see the password in bullet signs by default
    When User enters "<password>" password
    Then User should see the password in bullet signs

  @SalesManager
    Examples: SalesManager's username and password
      |password    |
      |saLesManager|

  @PosManager
    Examples: PosManager's username and password
      |password   |
      |posmanager|


  #6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
  @UPGN-290
  Scenario Outline: User tries whether enter button works on the login page.
    When User enters "<username>" username
    And User enters "<password>" password
    And User clicks the enter button
    Then User should see the dashboard


  @SalesManager
    Examples: SalesManager enter the button after mail and password
      |username               |password    |
      |salesmanager7@info.com |salesmanager|
      |salesmanager8@info.com |salesmanager|
      |salesmanager9@info.com |salesmanager|

  @PosManager
    Examples: PosManager enter the button after mail and password
      |username               |password  |
      |posmanager5@info.com   |posmanager|
      |posmanager6@info.com   |posmanager|
      |posmanager7@info.com   |posmanager|
