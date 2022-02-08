Feature: Fetching weather details from a city

  @Weather
  Scenario Outline: Fetching weather details from a city
    Given initiate the browser
    And navigate to website
    And input the city "<citynameforUI>" to check the weather
    When fetch the weather details
    And close the browser
    And Getting the weather details for the "<citynameforAPI>" city
    Then compare values from API and UI

    Examples: 
      | citynameforUI       | citynameforAPI |
      | Bangalore,Karnataka | Bengaluru      |
      | Delhi,Delhi,        | Mumbai         |
