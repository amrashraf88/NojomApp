Feature: Language Selection
  Scenario: User login to his account
    Given User opens the application
#    When User chooses Arabic language
#    And User accepts the terms and conditions
    And User presses the next button multiple times and starts login
    Then User enters phone number and password
    Given User opens the application