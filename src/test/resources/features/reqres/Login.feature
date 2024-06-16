Feature: Login user API
  @tugas
 Scenario Outline: Login user with valid credential
    Given Login user with valid file json "<fileName>"
    When Send request post login user
    Then Status code should be 200
    And Response body name should be token "<token>"
    And Validate json schema "login_valid_user_json_schema.json"
    Examples:
    |fileName       |token                  |
    |login_valid_user.json|QpwL5tke4Pnpja7X4|

    @tugas
    Scenario Outline: Login with invalid credential
      Given Login user with invalid file json "<fileName>"
      When Send request post login user
      Then Status code should be 400
      And Response body name should be error "<error>"
      And Validate json schema "login_invalid_user_json_schema.json"
      Examples:
      |fileName               |error           |
      |login_invalid_user.json|Missing password|