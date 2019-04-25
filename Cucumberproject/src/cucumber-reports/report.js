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
  "error_message": "java.lang.Error: Unresolved compilation problems: \n\tSyntax error, insert \"VariableDeclarators\" to complete LocalVariableDeclaration\n\tSyntax error, insert \";\" to complete LocalVariableDeclarationStatement\n\r\n\tat skelton.StpDef.user_enters_the_data_for_LoginPage(StpDef.java:39)\r\n\tat ✽.user enters the data for LoginPage(file:src/test/resources/skelton/CaseStudy.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StpDef.user_is_Login_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});