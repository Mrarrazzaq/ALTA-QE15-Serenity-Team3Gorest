Feature: Get Single Post API
  @Project
  Scenario: Get List posts with valid parameter id
    Given Get single posts with parameter id 139144
    When Send request get single posts
    And  Status code should be 200
    Then Validate json schema "single_post_json_schema.json"

  Scenario: Get single user with invalid parameter id
    Given Get single posts with parameter id 987123
    When Send request get single posts
    Then Status code should be 404
