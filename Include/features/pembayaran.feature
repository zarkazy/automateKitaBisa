@tag
Feature: pembayaran
i want to test payment page

  @tag1
  Scenario Outline: 
    Given navigate to payment page in kitabisa
    When I fill <amount>
    And I choose payment metods
    And I set <name>
    And I text <email>
    And I click submit button
    Then verify payment success

    Examples: 
      |amount|name|email|
      |10000| rizza | r@gmail.com |
      