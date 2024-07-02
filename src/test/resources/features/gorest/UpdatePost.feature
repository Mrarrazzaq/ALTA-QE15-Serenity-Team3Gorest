Feature: Update Post API
  @Project
  Scenario: Update post with valid parameter id and valid json
    Given Update post with parameter id 139028 and valid json "update_post.json"
    When Send request update post
    Then Status code should be 200
    And Response body title should be "berubah untuk jadi title1" and body "berubah untuk jadi body2"
    Then Validate json schema "update_post_json_schema.json"
