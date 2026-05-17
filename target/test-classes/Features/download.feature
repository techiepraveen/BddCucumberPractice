Feature: Download Page

  Background:
    Given user is on the downloadlinkpage

  Scenario: verify that user is able to see download

    When user clicks on inputdata link
    Then that page should gets downloaded

  Scenario: Verify that input data link should be shown

    Then input data link should be shown
