Feature: Search Youtube
  Scenario: I want to using feature search on youtube
    Given I Open browser
    And Open website Youtube
    And Located on youtube website
    When I search "Tulus"
    Then Showing result related with "https://music.youtube.com/watch?v=E7kHvjvU6JY"