$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Homepage.feature");
formatter.feature({
  "name": "To check the Webpage of the SHOPEE MALL",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To book the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to login the account",
  "keyword": "Given "
});
formatter.match({
  "location": "MainClass.to_login_the_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the product name and select the product",
  "keyword": "When "
});
formatter.match({
  "location": "MainClass.enter_the_product_name_and_select_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the price and add the product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MainClass.check_the_price_and_add_the_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give details and pay",
  "keyword": "Then "
});
formatter.match({
  "location": "MainClass.give_details_and_pay()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});