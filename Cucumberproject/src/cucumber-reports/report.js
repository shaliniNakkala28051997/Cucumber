$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skelton/shout.feature");
formatter.feature({
  "name": "shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sean shouts",
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
  "name": "Sean is 10 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "ClassDefinitions.sean_is_meters_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "ClassDefinitions.sean_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia \"listens\" to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "ClassDefinitions.lucia_listens_to_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "shout Feature",
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
  "name": "Sean is 200 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "ClassDefinitions.sean_is_meters_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "ClassDefinitions.sean_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia \"cannot listens\" to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "ClassDefinitions.lucia_listens_to_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});