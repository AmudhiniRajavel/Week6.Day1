Feature: Login functionality
#Scenario: TC002_CreateLead functionality
Background:
Given Launch the Browser

Scenario Outline: TC003_Login functionality-Positive
Given Load the URL
Given Enter UserName as <userName>
Given Enter Password as <password>
When Click on Login button

Examples:
|userName|password|
|'DemosalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario Outline: TC004_Login functionality-Negative
Given Load the URL
Given Enter UserName as <userName>
Given Enter Password as <password>
When Click on Login button

Examples:
|userName|password|
|'DemosalesManagr'|'we'|
|'DemoCSR'|'crfa'|



#Given Launch the browser
#And Load the URL
#And Enter UserName
#And Enter Password
#And Click on Login button
#And Click on CRM/SFA Link
#And Click on Leads
#And Click on Create Lead
#And Create Company Name
#And Create FirstName
#And Create LastName
#When Click on submit button
#Then Should be created