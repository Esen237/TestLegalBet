Feature:  Compare reviews
@Smoke
  Scenario:  Compare reviews
    Given user is on "https://legalbet.ru/"
    Then user should see "Ставки на спорт начинаются здесь"
    And user open menu Букмекеры
    When user click on Все легальные букмекеры button
    And user should find "Легальные букмекерские конторы в России 2022"
    Then user choose last one with given bonus and compare reviews


