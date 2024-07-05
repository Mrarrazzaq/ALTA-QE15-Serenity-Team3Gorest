@User
Feature: Get single user API
  Scenario: Get single users with valid parameter page
    Given user with id 7013983
    When  Send request get single user
    Then  Status code should be 200
