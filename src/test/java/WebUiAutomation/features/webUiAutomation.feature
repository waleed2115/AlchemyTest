Feature: Verify Location Search

  @TEST
  Scenario: Verify google maps searched location text
    Given   "chrome" browser is initialized with "https://www.google.com/maps" url
    When User searches location "Dublin" on the search location text-box
    When Verify searched location is "Dublin"