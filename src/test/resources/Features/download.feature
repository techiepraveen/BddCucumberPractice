Feature: Download Page

  Scenario: Verify that user is able to download the file from the page
    Given user is on the website
    When user is click on any file
    Then file should gets downloaded

  Scenario:Verify that user should see the downloadable link
    Given  user is on the website
    Then user should see the downloadable link on the page
