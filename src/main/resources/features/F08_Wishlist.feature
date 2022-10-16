@smoke

  Feature: user can add products on wishlist successfully
    Scenario: user can add items into wishlist
      When user click on Wish button
      Then user should successfully added item



      Scenario: user can check Qty of his Wishlist
        When user click on Wish button
        When user click on xbutton
        And  user click on wishlist button
        Then user can check Qty of his product



