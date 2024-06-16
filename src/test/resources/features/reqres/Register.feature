Feature: Register user reqres API
  @tugas
  Scenario Outline: Register successful to reqres API
    Given Register new user with valid file json "<fileName>"
    When Send request post register user
    Then  Status code should be 200
    And Response body page should be id <id> and token "<token>"
    And Validate json schema "register_user_json_schema.json"
    Examples:
    |fileName          |id|token            |
    |register_user.json|4 |QpwL5tke4Pnpja7X4|

    @tugas
    Scenario Outline: Register Unsuccessful to regres API
      Given Register new user with invalid file json "<fileName>"
      When Send request post register user
      Then Status code should be 400
      And Response body name should be error "<error>"
      And Validate json schema "register_user_unsuccessful_json_schema.json"
      Examples:
      |fileName                       |error           |
      |register_user_unsuccessful.json|Missing password|