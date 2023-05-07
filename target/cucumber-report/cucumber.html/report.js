$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "homepage search",
  "description": "\r\nAs a User I want to check homepage Search Result Using Different DataSet",
  "id": "homepage-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5426399800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should search product and adding to cart page successfully",
  "description": "",
  "id": "homepage-search;user-should-search-product-and-adding-to-cart-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Displays seven popular products by default in home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter text Blouse in the search box",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should verify text \"Blouse\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open a detailed page on product when i clicked",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the description of the product",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I adding the product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I informs the user There is 1 item in your cart.",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 159252000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.displays_seven_popular_products_by_default_in_home_page()"
});
formatter.result({
  "duration": 199604700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterTextBlouseInTheSearchBox()"
});
formatter.result({
  "duration": 107743800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSearchButton()"
});
formatter.result({
  "duration": 1332857400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.iShouldVerifyText(String)"
});
formatter.result({
  "duration": 148419300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.prestashop.steps.MyStepdefs.iShouldVerifyText(MyStepdefs.java:52)\r\n\tat ✽.And I should verify text \"Blouse\"(homepage.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.iOpenADetailedPageOnProductWhenIClicked()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iVerifyTheDescriptionOfTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iAddingTheProductToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iInformsTheUserThereIsItemInYourCart(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 221816300,
  "status": "passed"
});
});