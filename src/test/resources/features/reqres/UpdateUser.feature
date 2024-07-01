Feature: Update User API
  @Project
  Scenario Outline: Updtae user with valid parameter id and valid json
    Given Update user with parameter id 6940194 and valid json "<fileName>"
    When Send request put update user
    Then Status code should be 200
    And Response body page should be "<name>" and "<email>"
    Then Validate json schema "update_user_json_schema.json"
    Examples:
    |fileName        |name    |email          |
    |update_user.json|digantiiii|azzzz@ymaillll.com|

    @tugas
    Scenario Outline: Update user using patch methode with valid parameter id and invalid json file
      Given Update user with parameter id 2 and valid json "<fileName>"
      When Send request patch update user
      Then Status code should be 200
      And Response body name should be "<name>" and job should be "<job>"
      And Validate json schema "update_user_patch_json_schema.json"
      Examples:
      |fileName              |name       |job             |
      |update_user_patch.json|Rahmad Edit|QE Engineer Edit|