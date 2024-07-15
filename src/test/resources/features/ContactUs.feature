Feature: Contact Us form submission

  Background:
    Given user is on "Contact Us" page

  @wip
  Scenario Outline: Successful form submission
    When user enters "<First name>" in the "First name" field
    And user enters "<Last name>" in the "Last name" field
    And user enters "<City name>" in the "City" field
    And user selects "<State>" from the "<State dropdown>"
    And user enters "<Zip code>" in the "Zip" field
    And user enters "<Message>" in the "Message" field
    And user checks the "Agree to terms and conditions" checkbox
    And user clicks the "Submit form" button
    Then user should see message "Thank you for contacting us"
    Examples:
      | First name | Last name | City name | State    | Zip code | Message        |
      | John       | Doe       | New York  | New York | 10001    | Hello New York |
      | Kelly      | Doe       | Chicago   | Illinois | 60001    | Hello Chicago  |


