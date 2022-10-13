@smoke
  Feature: user can change currency from dollars to Euro
    Scenario: user could change currencies
      When user Click to droplist currency changer
      And Click on Euro currency
      Then Currencies should be changed to Euro
      And Elements should be shown

