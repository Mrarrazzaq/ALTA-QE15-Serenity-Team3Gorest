Feature: Delete a post
  @Project
  Scenario: Delete post with valid parameter id
    Given Delete post with id 139026
    When  Send request delete post
    Then  Status code should be 204

  Scenario: Delete post with nonexist user id
    Given Delete post with id 138968
    When  Send request delete post
    Then  Status code should be 404
    And Validate json schema "empty_post_json_schema.json"