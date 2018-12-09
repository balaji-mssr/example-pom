Feature: Navigation Checks

  Scenario: Able to check the Road Cycling Navigation details
    Given I am EuroSport Shop Customer
    When accessing Road Cycling Navigation Shop section
    Then the Road Cycling Navigation details are displayed
      | Clothing            |
      | Jerseys             |
      | Jackets             |
      | Gilets              |
      | Base Layers         |
      | Sports Bras         |
      | Bib Shorts & Shorts |
      | Bib Tights & Tights |
      | Kids                |
      | All Clothing        |