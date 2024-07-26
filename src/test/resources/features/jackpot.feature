Feature: Jackpot features

  Background:
    Given user is on the home page and accepts the cookie consent

  @regression
  Scenario: Verifying that user is able to access games by features jackpot
    When user click on the Categories link
    And user selects on features tag called "Jackpot"
    And user click on button showing "Results"
    Then user is landed on results page with heading "Results"
    And selected category displayed is "Jackpot"