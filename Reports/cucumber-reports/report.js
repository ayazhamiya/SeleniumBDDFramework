$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Test google search",
  "description": "  I want to test the search functionality of google",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search random string",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on google home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for \"\u003cstring\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "search results for \"\u003cstring\u003e\" are displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "string"
      ]
    },
    {
      "cells": [
        "selenium"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search random string",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearch.homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"selenium\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearch.i_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search results for \"selenium\" are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.search_results_are_displayed(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: result title doesn\u0027t contain searched string did not expect to find [true] but found [false]\n",
  "status": "failed"
});
});