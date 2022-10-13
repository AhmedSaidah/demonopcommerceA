@smoke

  Feature: user should hover on Categories and use sub categories aswell

    Scenario: user can hover on main categories on homepage
      When  user hover on Computers category
      And   user click on sub-category
      Then  Sub-category page should be shown

