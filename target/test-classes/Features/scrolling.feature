Feature: Scrolling

  Scenario: verify that user is able to scroll horizontal
    Given user is on the website
    When user clicks on horizontals scroll
    Then horizontal scroll should work


  Scenario: verify that user is able to scroll vertical
    Given user is on the website
    When user clicks on vertical scroll
    Then vertical scroll should work