$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logFeature.feature");
formatter.feature({
  "line": 1,
  "name": "login to the sauce demo",
  "description": "",
  "id": "login-to-the-sauce-demo",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Valid user should able to login",
  "description": "",
  "id": "login-to-the-sauce-demo;valid-user-should-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@regression,"
    },
    {
      "line": 12,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user insert new valid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user insert valid \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should able to login",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 21,
      "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 22,
      "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 2040700100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Valid user should able to login",
  "description": "",
  "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression,"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user insert new valid \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user insert valid \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_insert_new_valid(String)"
});
formatter.result({
  "duration": 123720000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_insert_valid(String)"
});
formatter.result({
  "duration": 88007400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_in_the_signin_button()"
});
formatter.result({
  "duration": 5145867800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_able_to_login()"
});
formatter.result({
  "duration": 33894100,
  "status": "passed"
});
formatter.after({
  "duration": 5926689700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 1324479100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Valid user should able to login",
  "description": "",
  "id": "login-to-the-sauce-demo;valid-user-should-able-to-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression,"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user insert new valid \"problem_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user insert valid \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click in the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should able to login",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_insert_new_valid(String)"
});
formatter.result({
  "duration": 102069100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_insert_valid(String)"
});
formatter.result({
  "duration": 93160000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_in_the_signin_button()"
});
formatter.result({
  "duration": 5142112500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_able_to_login()"
});
formatter.result({
  "duration": 34740500,
  "status": "passed"
});
