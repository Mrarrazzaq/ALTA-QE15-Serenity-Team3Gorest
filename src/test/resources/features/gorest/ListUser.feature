Feature: Get List Users API
  @Project
 Scenario: Get List users with valid parameter page
    Given Get List users with parameter page
    When Send request get list users
    And  Status code should be 200
    Then Validate json schema "list_users_json_schema.json"

  @Project
  Scenario: Get List users with invalid parameter page
    Given Get List users with invalid parameter page "**********"
    When Send request get list users invalid
    And Status code should be 404