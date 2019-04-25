Feature: Login Feature
@valid
Scenario: Valid User Scenario
Given The URL of TestMe App
When user enters <username> as username
And user enters <password> as password
Then user is in <page>


|username  |password    | page     |
|Lalitha   |Password123 | Home     |
|admin     |Password456 |Admin Home|
@invalid
Scenario: invalid scenario
Given The URL of TestMe App
When user enters invalid data
|abcxyz|Password123|
|Lalitha|abc1223|
|abc123|abc123|
Then user is in loginpage
|bdc|
|ddc|
|ghj|


