#Author: your.email@your.domain.com
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

Feature: Post, Update and Get flows

	@TC001 @smoke
  Scenario Outline: Post and get
    Given Post request done with <caseNum>
    When Get request for created ID
    Then Name of <caseNum> is displayed
    
    Examples: 
      | caseNum  | value | 
      | 1 			 |     5 |  
      | 2				 |     7 |  
      | 3				 |     7 | 
      | 4				 |     7 | 
      | 5				 |     7 | 
      | 6				 |     7 | 
      | 7				 |     7 | 
      | 8				 |     7 | 
      | 9				 |     7 | 
      | 10			 |     7 | 
      | 11			 |     7 | 
      | 12			 |     7 | 
      | 13			 |     7 | 

  @TC002 
  Scenario Outline: Post, Update and get
    Given Post request done with <caseNum>
    When Put request for created ID
    And Get request for created ID
    Then Name of <caseNum> is displayed

    Examples: 
      | caseNum    | value | 
      | 14				 |     7 | 
      | 15				 |     7 | 
      | 16				 |     7 | 
      | 17				 |     7 | 
      | 18				 |     7 | 
      | 19				 |     7 | 
      | 20			   |     7 | 
      | 21			   |     7 | 
      | 22			   |     7 | 
      | 23			   |     7 | 
      | 24			   |     7 | 
      | 25			   |     7 | 
      | 26			   |     7 | 