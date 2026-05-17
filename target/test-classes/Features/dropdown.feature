Feature: Drop Down Feature

  Scenario: Verify that user is able to see options in the dropdown
    Given user is on the website
    When user clicks on the dropdown
    Then dropdown should have values

  Scenario: Verify that user is should be able to select options form the downlod
    Given user is on the website
    When user is trying to choose the option
    Then user should be able to choose from dropdown