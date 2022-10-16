@smoke
Feature: F07_followUs | users could open followUs links
 Scenario Outline: user opens facebook link
  When user opens facebook link
  Then New Tab "<Link>" should be opened

    Examples:
   |Link|
   |https://www.facebook.com/nopCommerce|

 Scenario Outline: user opens twitter link
  When  user opens twitter link
  Then New Tab "<Link>" should be opened
  Examples:
   |Link|
   |https://twitter.com/nopCommerce|

Scenario Outline: user opens rss link
  When user opens rss link
  Then New Tab "<Link>" should be opened
 Examples:
  |Link|
  |https://demo.nopcommerce.com/new-online-store-is-open|

Scenario Outline: user opens youtube link
  When user opens youtube link
  Then New Tab "<Link>" should be opened
 Examples:
  |Link|
  |https://consent.youtube.com/m?continue=https%3A%2F%2Fwww.youtube.com%2Fuser%2FnopCommerce%3Fcbrd%3D1&gl=FR&m=0&pc=yt&hl=en&src=1|