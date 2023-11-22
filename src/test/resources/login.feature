Feature: Login functionality


  Scenario: Successful Login with Valid Credentials
    When User enters valid username "username" and password "password"
    And User clicks on the login button
    Then User should be logged in successfully


  Scenario: Try Login with Invalid Credentials
    When User enters invalid username "john@example.com" and password "Password123"
    And User clicks on the login button
    Then User should get error message



