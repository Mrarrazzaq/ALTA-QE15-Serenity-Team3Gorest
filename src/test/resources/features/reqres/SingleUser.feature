#Feature: Get single user API
#  @tugas
#  Scenario Outline: Get single user with valid parameter page
#    Given Single user with id 6940187
#    When Send request get single user
#    Then Status code should be 200
#    And Response body page should be "<name>" and "<email>"
#    And Validate json schema "single_user_json_schema.json"
#    Examples:
#    |name               |email                                |
#    |Chandramauli Guneta|guneta_chandramauli@wilderman.example|
#
#    @tugas
#    Scenario: Get single user not found
#      Given Single user with id 23
#      When Send request get single user
#      Then Status code should 404
#
#      @tugas
#      Scenario: Get single user not found by resources
#        Given Single user with id 23
#        When Send request get single user resources
#        Then Status code should be 404