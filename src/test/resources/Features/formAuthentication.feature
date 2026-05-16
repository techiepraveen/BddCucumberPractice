Feature: Form Authentication


  Scenario Outline: verify that user is able to login via username and password
    Given user is on the website
    When user enters <uername> and <password>
    Then user should be able to login
    Examples:
    |username|password            |
    |tomsmith|SuperSecretPassword!|
    |shivam  | password           |
    |aman    | passwords          |

  Scenario: verify that all the field should be visible on the page
    Given user is on the website
    Then username, password and login field shuld be shown