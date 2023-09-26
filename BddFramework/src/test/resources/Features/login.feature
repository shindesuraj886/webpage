Feature: Login page Automation Of  Jala Academy 

Scenario: Check login Sucessful with valid credentials 
Given user is on login Page
When User enters valid "<username>" And "<password>"
And Clicks on login Button
Then user navigate to home Page
And  Close the browser

 @Smoke
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

@Regression
  Scenario: with regression
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And yet another action
    Then I validate the outcomes

    @Smoke @Regression
  Scenario: with regression
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And yet another action
    Then I validate the outcomes
    
 
    Examples: 
              | username | password  |
              |training@jalaacademy.com  | jobprogram |
