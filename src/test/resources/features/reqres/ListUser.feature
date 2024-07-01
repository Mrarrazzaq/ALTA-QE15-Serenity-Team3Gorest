Feature: Get List Users API
  @Project
 Scenario: Get List users with valid parameter page
    Given Get List users with parameter page
    When Send request get list users
    And  Status code should be 200
#    And Response body page should be "<name>" and "<email>"
    Then Validate json schema "list_users_json_schema.json"
#    Examples:
#    |name             |email                      |
#    |Fr. Arnesh Shukla|shukla_fr_arnesh@white.test|


#    Catatan, kalo mau pagenya cuma satu misal "2", hapus tulisan Outline <page> dan example ganti dengan 2
  # Kalau tipenya string ganti menjadi "<string>"