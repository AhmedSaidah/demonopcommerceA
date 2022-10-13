@smoke
Feature:
  Scenario Outline: 1 user could search using product name
     When user enter product name on search bar "<product>"
     And click on search button
     Then proudct"<product>" should be shown


    Examples:
      |product|
      |book|
      |laptop|
      |nike|


  Scenario Outline: 2 user could search for product using sku
    When  user enter product name on search bar "<sku>"
    And   click on search button
    And   user click on product
    Then sku"<sku>" should be shown



    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|