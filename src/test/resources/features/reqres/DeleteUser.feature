Feature: Delete a user
  @tugas
  Scenario: Delete user with valid parameter id
    Given Delete user with id 2
    When  Send request delete user
    Then  Status code should be 204