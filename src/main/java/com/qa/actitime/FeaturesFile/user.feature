#Author: deepakBellodiLabs@your.domain.com
#Keywords Summary :
Feature: User creation in Actitime Website

  Scenario: Actitime new User Creation
    Given User is already present in loginPage
    When Title of the login page is ActitimeLogin
    Then User enter username and password
      | admin | manager |
    Then User click on LoginBtn
    Then User is on TimeTrackPage
    Then User click on the UserLink
    Then User click on addUserBtn
    Then User enters the firstname and lastname and email
      | deepak | bellodi | deepak@gmail.com |
    Then User close the browser
