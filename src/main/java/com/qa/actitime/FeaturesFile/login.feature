Feature: ActiTime Login Feature

#Without Example Keyword 
 # Scenario: ActiTime LoginTest Scenario
 #   Given User is already available on login page
#    When Title of the login page is ActiTimeLogin
 #   Then User enters "admin" and  "manager"
#    Then User click on LoginBtn
 #   Then User is in TimeTrackPage
 #   Then User close the Browser
    
    #with Example Keyword 
     Scenario Outline: ActiTime LoginTest Scenario
    Given User is already available on login page
    When Title of the login page is ActiTimeLogin
    Then User enters "<username>" and  "<password>"
    Then User click on LoginBtn
    Then User is in TimeTrackPage
    Then User close the Browser
    
    Examples:
    | username| password|
    |	admin   |manager  |
    |	admin		|manager1 |

 # Scenario: User Clicks on the UserPage
  #  Given User already in timetrack page
  #  When User mouse over on the userlink
   # Then User click the User link
   # Then User Click the Add userBTN
   # Then User close the browser