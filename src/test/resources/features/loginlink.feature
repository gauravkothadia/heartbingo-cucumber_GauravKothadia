Feature: Login link feature

  Background:
    Given user is on the home page and accepts the cookie consent

  @regression
  Scenario:Verifying the login link on home page
    When user click on link showing "Log In"
    Then user is able to verify login popup page with session text "Log In to start playing."