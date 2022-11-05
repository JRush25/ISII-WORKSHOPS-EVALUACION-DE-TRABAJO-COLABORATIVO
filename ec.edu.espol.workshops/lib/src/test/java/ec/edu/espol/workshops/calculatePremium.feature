#Author: Joselyne Torres
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@F1
Feature: Calculate the premium
  
  @E01
  Scenario: Customer does not have a valid license
      Given customer does not have a valid license
      When calculate the premium
      Then show "Customer does not comply with policies"

  @E02
  Scenario: Customer is under 18 years old
      Given customer is 5 years old
      When calculate the premium
      Then show -1

  @E03
  Scenario: Customer is over 80 years old
      Given customer is 90 years old
      When calculate the premium
      Then show "Customer does not comply with policies"

