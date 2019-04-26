$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skelton/CaseStudy.feature");
formatter.feature({
  "name": "TestMeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LoginScenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "StpDef.url_of_the_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for LoginPage",
  "keyword": "When "
});
formatter.match({
  "location": "StpDef.user_enters_the_data_for_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StpDef.user_is_Login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});