Feature: Purchase Medicine

 Background: Launch the browser
    When I have opened the mediCare application in browser
  
  Scenario: Order one medicine and check it out
    When user clicks on View Products tab
    And click on add to cart icon of the selected product
    When user clicks on checkout button
    And clicks on select button
    And provides Card number expiry date and CVV code
    And clicks on Pay button
    Then user should see the confirmation message "Your Order is Confirmed!!"
    
  Scenario: Order two medicines and check it out
     When user clicks on View Products tab
     And user clicks on add to cart for Combiflame and Amoxicillin items
     When user clicks on checkout button
     And clicks on select button
     And provides Card number expiry date and CVV code
     And clicks on Pay button
     Then user should see the confirmation message "Your Order is Confirmed!!"
    