Feature: Update User API
  @latihan
  Scenario: Updtae user with valid parameter id and valid json
    Given Update user with parameter id 2 and valid json "update_user.json"
    When Send request put update user
    Then Status code should be 200
    And Response body name should be "Rahmad Edit" and job should be "QE Engineer Edit"

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