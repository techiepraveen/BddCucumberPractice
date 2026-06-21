Feature: File Upload

  Background:
    Given user is on the upload file page

  Scenario: Verify that user is able to upload file
    When user is trying to upload the file
    Then file should gets uploaded

  Scenario: Verify that uploaded file name should be shown
    When user is trying to upload the file
    Then file should gets uploaded
    Then uploaded file should be shown on the website
