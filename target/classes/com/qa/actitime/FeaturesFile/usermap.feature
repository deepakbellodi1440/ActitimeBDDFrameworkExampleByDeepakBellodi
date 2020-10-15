#Author: deepakBellodiLabs@your.domain.com
#Keywords Summary :
Feature: User creation in Actitime Website using Map

  Scenario: Actitime new User Creation using DataTables with Maps
    Given User is already present in loginPage
    When Title of the login page is ActitimeLogin
    Then User enter username and password
      | username | password |
      | admin    | manager  |
    Then User click on LoginBtn
    Then User is on TimeTrackPage
    Then User click on the UserLink
    Then User click on addUserBtn
    Then User enters the firstname and lastname and email
      | firstName | LastName | Email            |
      | deepak    | bellodi  | deepak@gmail.com |
      | akash     | bellodi  | akash@gmail.com  |
      | abhi      | bellodi  | abhi@gmail.com   |
    Then User close the browser
