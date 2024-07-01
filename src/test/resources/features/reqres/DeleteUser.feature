Feature: Delete a user
  @Project
  Scenario: Delete user with valid parameter id
    Given Delete user with id 6940197
    When  Send request delete user
    Then  Status code should be 204