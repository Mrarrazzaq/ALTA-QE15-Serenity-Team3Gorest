Feature: Get List Users API
  @Latihan
  Scenario Outline: Get List users with valid parameter page
    Given Get List users with parameter page <page>
    When Send request get list users
    Then  Status code should be 200
    And Response body page should be <page>
    And Validate json schema "list_users_json_schema.json"
    Examples:
    |page|
    |1   |
    |2   |

#    Catatan, kalo mau pagenya cuma satu misal "2", hapus tulisan Outline <page> dan example ganti dengan 2
  # Kalau tipenya string ganti menjadi "<string>"