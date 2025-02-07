Feature: User Registration on Medicare Website
 
Background: Launch the browser
    When I have opened the mediCare application in browser
    And click on Sign Up link
 
Scenario: User successfully registers on the medicare website
    When user enters customer details
    And clicks on Next-Billing button
    When user fills in delivery address details
    And clicks on Next-Confirm button
    Then user is displayed with the fed information
    And click on confirm button
    Then user should see the message "You can use your email address as username to login!"
    