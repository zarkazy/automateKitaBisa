@tag
Feature: negatif pembayaran
  i want to test payment page with negatif test

  @tag2
  Scenario Outline: 
    Given navigate to kitabisa pages
    When set amounts <amounts>
    And set names <names>
    And set emails <emails>
    And submit button
    Then alert appears

    Examples: 
      | amounts | names | emails |
      |   null | null | null |
      | null  | 19212 | 12334 |
      | 1 | supri | r@ |
  
