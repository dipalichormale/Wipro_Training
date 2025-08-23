Feature: Login functionality
 
  Scenario:
    : Successful login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see the home page
    
  Example:Successful login
      |username|password|
      |rasha   |rasha123|
      |ravi    |rav21   |
 
  Scenario:
    : Failed login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see an error message
    
  Example:Failed login
      |username|password|
      |rasa    |rash123 |
      |rai     |rai21   |
      