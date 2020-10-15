#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Repots creation in Actitime

Scenario: Actitime Sample Report Creation
    Given User is already present in loginPage
    When Title of the login page is ActitimeLogin
    Then User enter username and password
    Then User click on LoginBtn
    Then User is on TimeTrackPage
    Then User click on the ReportLink
    Then User click on Create ChartBtn
    Then User close the browser
