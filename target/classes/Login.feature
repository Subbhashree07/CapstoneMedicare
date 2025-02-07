Feature: Validate Login functionality of user

Background: Launch The browser
    When I have opened the mediCare application in browser
Scenario Outline: Unsuccessful login due to invalid login credentials
   When the user clicks on login link
   And the user enters invalid username "<username>" and password "<password>"
   And clicks on the login Button
   Then the user should see the error message "Username and Password is invalid!"
   
    Examples: 
      | username      | password  |
      | subi@abc.com  |  kiki@123 |


Scenario Outline: Validate successful Login
   When the user clicks on login link
   When the user enters valid username "<username>" and password "<password>"
   And clicks on the login Button
   Then the user should be directed to the Home page

   Examples: 
   | username     | password   |
   | subi@abc.com |   Subi@123 |
