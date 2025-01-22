@All_Scenarios
Feature: Invalid login Credentials validation for Expleosurance
  Author: Ragul
	
  Scenario Outline: Validation of invalid credentials
    Given User Enters invalid "<username>" and invalid "<password>"
    When User Click the login button
    Then Error message will be displayed

    Examples: 
      | username                                   | password   |
      | ragul.duraisamy@expleogroup.com            | Expleo@1   |
      | ragul.duraisam@expleogroup.com             | Expleo@123 |
      

  Scenario Outline: Validation of Empty credentials
    Given User Enters Empty "<username>" and "<password>"
    When User Clicks the login button
    Then Error message will be displayed as Username and password are required

    Examples: 
      | username                                   | password   |
      | ragul.duraisamy@expleogroup.com            |            |
      
