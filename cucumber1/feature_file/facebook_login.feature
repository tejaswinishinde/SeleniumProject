
@Facebook
Feature: Login feature
  I want to test login Feature template of facebook application

  @Login
  Scenario: Login scenario
    Given I am user of facbook application
    When I enter valid username
    And I enter valid password
    And I click on login button
    Then user should be able to login successfully.
    And check more outcomes

  @SignUp
  Scenario Outline: SignUp scenario 
    Given I am user of facbook application 
    When I enter valid <username>
    And I enter valid <password>

    Examples: 
      | username            | password      | 
      | tejsinde18@mail.com |     tejshinde | 
      
