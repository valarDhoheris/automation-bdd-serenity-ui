@uif
Feature: Login

  Scenario: Login Functionality

    Given User launches browser with url "https://www.amazon.in/"
    When User Navigate to Sign-in Page
    When User enters UserName and Password
    And User closes the browser

