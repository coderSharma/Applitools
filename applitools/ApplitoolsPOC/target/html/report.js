$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HoldenVisualTest.feature");
formatter.feature({
  "id": "this-is-a-poc-for-applitools-and-sut-is-www.holden.com.au",
  "description": "",
  "name": "This is a POC for Applitools and SUT is www.holden.com.au",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-is-a-poc-for-applitools-and-sut-is-www.holden.com.au;this-is-a-demo-for-applitools-with-chrome-browser",
  "description": "",
  "name": "This is a demo for Applitools with Chrome Browser",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Holden website",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I browse the website using \"Chrome\"",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I should be able to check any variations in UI",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "StepDefs.I_am_on_holden_website()"
});
formatter.result({
  "duration": 83268861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 28
    }
  ],
  "location": "StepDefs.I_browse_the_website_using_browser(String)"
});
formatter.result({
  "duration": 2924864472,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.I_should_be_able_to_check_any_variations_in_UI()"
});
formatter.result({
  "duration": 6536937932,
  "status": "passed"
});
});