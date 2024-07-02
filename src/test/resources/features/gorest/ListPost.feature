Feature: Get List Posts API
  @Project
  Scenario: Get List posts with valid parameter page
    Given Get List posts with parameter page 1
    When Send request get list posts
    And  Status code should be 200
    Then Validate json schema "list_posts_json_schema.json"

  Scenario: Get list posts with invalid parameter page string
    Given Get list posts with invalid parameter page "xxxx"
    When Send request get list posts
    Then Status code should be 400