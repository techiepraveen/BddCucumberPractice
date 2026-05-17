Feature: Form Authentication
    Background:
      Given user is on the formAuthentication

  Scenario Outline: verify that user is able to login via username and password

    When user enters "<username>" and "<password>"
    And click on login button
    Then user should be able to login
    Examples:
    |username|password            |
    |tomsmith|SuperSecretPassword!|
    |shivam  | password           |
    |aman    | passwords          |

  Scenario: verify that all the field should be visible on the page
    Then username, password and login field should be shown