Feature: Create post API
  @Project
  Scenario Outline: Create new post with valid json
    Given Create new post with file json "<fileName>"
    When Send request create post
    Then Status code should be 201
    And Response body id should be <user_id> and title should be "<title>" and body should be "<body>"
    And Validate json schema "create_post_json_schema.json"
    Examples:
      |fileName        |user_id|title       |body       |
      |create_post.json|6942112|singkat     |pendek     |

  Scenario: Create new post with nonexist user
    Given Create new post with file json "create_invalid_post.json"
    When Send request create post
    Then Status code should be 422