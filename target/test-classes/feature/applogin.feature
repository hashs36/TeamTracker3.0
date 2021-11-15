Feature: Applogin

  Scenario: applogin functionality test with valid credentials
    Given User launch Firefox browser 
    When user open URL "https://test.teamtracker.locationguru.in"
    And user enter user as "admin" and password as "tech8092"
    And click on login
    Then page title should be "TeamTracker"
    And Close browser