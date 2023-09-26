Feature: feature demo tag

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
    
