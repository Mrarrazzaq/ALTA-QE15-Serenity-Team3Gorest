@Project
Feature: Create user API
  Scenario Outline: Create new user with valid json
    Given Create new user with valid file json "<fileName>"
    When Send request post create user
    Then Status code should be 201
    And Response body name should be "<name>" and job should be "<email>"
    And Validate json schema "create_user_json_schema.json"
    Examples:
    |fileName        |name       |email              |
    |create_user.json|project019|project019@gmail.com|

@Project
Scenario Outline: Create new user using post method with invalid json file
  Given Create new user with valid file json "<fileName>"
  When Send request post create user
  Then Status code should be 401
  Examples:
  |fileName                |
  |create_invalid_user.json|

  @Project
  Scenario: Create new user with valid json without API Key
    Given Create new user with valid file json "create_user.json" with no API Key
    When Send request post create user
    Then Status code should be 422

    @Project
    Scenario: Create new user with existing user data
      Given Create new user with valid file json "create_user.json"
      When Send request post create user
      Then Status code should be 422
