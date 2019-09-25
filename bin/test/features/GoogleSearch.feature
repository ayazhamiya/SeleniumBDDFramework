#Author: ayazhamiya@gmail.com

Feature: Test google search
  I want to test the search functionality of google

 Scenario Outline: Search random string
    Given I am on google home page
    When I search for "<string>"
    Then search results for "<string>" are displayed
    
    Examples:
    	| string |
    	| selenium |