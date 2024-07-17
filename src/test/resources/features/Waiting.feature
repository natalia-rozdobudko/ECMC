Feature: Verify alerts on Waiting page

  Scenario: Wait for the page to load and verify alerts
    Given user is on "Waiting" page
    When the page has fully loaded
    And the user clicks the "Enable Show Alert Button" button
    And the user clicks the "Show Alert" button
    Then an alert should be displayed with the text
    And the user accepts the alert
    When the user clicks on "Accordion Item #1" accordion
    And the user enters alert text in "Accordion One"
    When the user clicks on "Accordion Item #2" accordion
    And the user enters alert text in "Accordion Two"
    When the user clicks on "Result" accordion
    And the user clicks the "Show Accordion Message" button
    Then the third accordion's alert text should match the entered text