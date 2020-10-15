Feature: Actitime Hooks check on UserPage
  Scenario: ActiTime Users Test Scenario
    Given User is already available on UsersPage page
    When Title of the login page is UsersPAge
    Then User fills the user form
    Then User creted

 Scenario: ActiTime search user on Users Test Scenario
    Given User is already available in UsersPage page
    Then User search the name in the search context
    Then User found 