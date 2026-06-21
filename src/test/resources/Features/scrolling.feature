Feature: Scrolling

  Background:
    Given user is on the infinite scroll

  Scenario: verify that user is able to scroll vertical
    When user clicks on vertical scroll
    Then vertical scroll should work