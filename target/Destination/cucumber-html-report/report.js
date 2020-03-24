$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/changeCurrency.feature");
formatter.feature({
  "name": "As a user I should able to change currency,",
  "description": "  so that I can use a different currency",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@changeCurrency"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "I should able to change currency successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@changeCurrency"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the NopeCommerce  homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "NopComHybrid.MyStepdefs.iAmOnTheNopeCommerceHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change currency to USD",
  "keyword": "When "
});
formatter.match({
  "location": "NopComHybrid.MyStepdefs.iChangeCurrencyToUSD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see all the prices have change to USD",
  "keyword": "Then "
});
formatter.match({
  "location": "NopComHybrid.MyStepdefs.iCanSeeAllThePricesHaveChangeToUSD()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});