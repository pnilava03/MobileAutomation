Feature: As a user, I am able to navigate each and every link from application Menu bar

  Background: User able to login to the application and navigate to Store link
    Given the application "AppURL"
    When user clicks on Menu item


  Scenario: 1. user able to verify Shop iPad text on UI screen
    And user clicks on Store link
    And user clicks on iPad subLink
    Then user verify Shop iPad text on UI screen

  Scenario: 2. user able to verify MacBook Air 15 text on UI screen
    And user clicks on MAC link
    And user clicks on Explore All Mac subLink
    Then user verify MacBook Air text on UI screen

  Scenario: 3. user able to click on Apple TV 4K Link
    And user clicks on TV & Home link
    And user clicks on Apple TV 4K subLink
