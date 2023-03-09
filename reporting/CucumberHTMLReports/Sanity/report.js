$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/Features/login.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "Given: user is in Search page\nWhen: user enter a product\nAnd: Click on Search button\nThen: Product should be displayed",
  "keyword": "Scenario"
});
});