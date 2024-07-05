@User
Feature: Update User API
  Scenario Outline: Update user with valid parameter id and valid json
    Given Update user with parameter id 7013984 and valid json "<fileName>"
    When Send request put update user
    Then Status code should be 200
    And Response body page should be "<name>" and "<email>"
    Then Validate json schema "update_user_json_schema.json"
    Examples:
    |fileName        |name    |email          |
    |update_user.json|digantiiii|azzzz4@ymaillll.com|

    Scenario: Update user with invalid parameter id and valid json file
      Given Update user with parameter id 111222 and valid json "update_user.json"
      When Send request put update user
      Then Status code should be 404

      Scenario: Update user with valid parameter id and invalid json file
        Given Update user with parameter id 6940217 and valid json "update_invalid_user.json"
        When Send request put update user
        Then Status code should be 404

        Scenario: Update user without API Key
          Given Update user with parameter id 6940217 and valid json "update_invalid_user.json" and no API Key
          When Send request put update user
          Then Status code should be 404
