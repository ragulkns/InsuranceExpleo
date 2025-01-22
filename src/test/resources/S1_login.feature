@All_Scenarios
Feature: Login credentials for Expleoinsurance
  Author: Ragul

  Scenario Outline: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful