Feature: File Upload

  Scenario: Verify that user is able to upload file
    Given user is on the website
    When user is trying to upload the file
    Then file should gets uploaded

  Scenario: Verify that uploaded file name should be shown
    Given user is on the website
    When user uploaded the file
    Then uploaded file should be shown on the website
