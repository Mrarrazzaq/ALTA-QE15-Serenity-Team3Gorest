Feature: Get single user API
  @tugas
  Scenario Outline: Get single user with valid parameter page
    Given Single user with id 2
    When Send request get single user
    Then Status code should be 200
    And Response body page should be "<first_name>" and "<last_name>"
    And Validate json schema "single_user_json_schema.json"
    Examples:
    |first_name|last_name|
    |Janet     |Weaver   |

    @tugas
    Scenario: Get single user not found
      Given Single user with id 23
      When Send request get single user
      Then Status code should 404

      @tugas
      Scenario: Get single user not found by resources
        Given Single user with id 23
        When Send request get single user resources
        Then Status code should be 404