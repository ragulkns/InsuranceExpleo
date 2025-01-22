@All_Scenarios
Feature: New Insurance
Author: Ragul
	

  Scenario Outline: user enters insurance policy details
    Given user is on the login page with valid credentials
    When user clicks the New Insurance
    And user enters the "<Name>" and "<Email>" and "<Address>" and "<Birthdate>"
    And user clicks the Gender
    And user enters "<PolicyType>" and "<Coverage>" and "<SumInsured>" and "<Primium>"
    And user clicks the button
    Then user clicks the submit

    Examples: 
      | Name    | Email           | Address          | Birthdate  | PolicyType        | Coverage             | SumInsured | Primium |
      | Autotest | Test@gmail.com | 22, thambaram    | 22/11/1992 | Health Insurance  | Hospitalization cost |   3,00,000 |     400 |