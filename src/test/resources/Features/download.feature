Feature: Download Page

  Scenario: Verify that user is able to download the file from the page
    Given user is on the website
    When user is click on any file
    Then file should gets downloaded
