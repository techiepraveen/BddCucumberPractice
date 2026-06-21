Feature: JavaScript Alerts
  Background:
    Given user is on the javascript alert

  Scenario: verify that user is able to click on click for js Alert
    When user click for js Alert
    Then user should be able to handle alert

  Scenario: verify that user is able to click on click for JS Confirm alert
    When user click for JS Confirm alert
    Then user should be able to confirm or cancel the JS Confirm alert

   Scenario: verify that user is able to click on click for JS prompt
     When user click for click for JS prompt
     Then user should be able to confirm or cancel the click for JS prompt