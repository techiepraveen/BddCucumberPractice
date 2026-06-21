Feature: Keypresses

  Scenario: verify that user is able to press key from the keyboard
    Given user is on the keypresspage
    When user presses any key from keyboard
    Then that key should be shown in UI