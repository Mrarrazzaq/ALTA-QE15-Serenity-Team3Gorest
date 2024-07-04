Feature: Delete a user
  @Project
  Scenario: Delete user with valid parameter id
    Given Delete user with id 7004579
    When  Send request delete user
    Then  Status code should be 204

    @Project
    Scenario: Delete user with non exist parameter id
      Given Delete user with id 0000001
      When Send request delete user
      Then Status code should be 404

