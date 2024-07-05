Feature: Get single user API
  @Project
  Scenario: Get List users with valid parameter page
    Given user with id 6940231
    When  Send request get single user
    Then  Status code should be 200
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