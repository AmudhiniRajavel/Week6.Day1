Feature: LeafTaps features(5 TC)
Scenario: TC001_Create Lead
Given Click on Leads
And Click on Create Lead
And Create Company Name
And Create FirstName
And Create LastName
When Click on submit button
Then Should be created

Scenario: TC002_Edit Lead
Given Click on Leads
Given Click on Find Leads
Given Enter Edit fields
When Click ok button
Then Should be edited

Scenario Outline: TC003_Create Contact
Given Click Contacts
Given Click Create Contacts
Given Create FN <FN>
Given Create LN <LN>
When Click on Create Contact
Then Contact created successfully

Examples:
|FN|LN|
|'Amudhini'|'Rajavel'|
|'Aadhav'|'M'|

Scenario: TC004_Duplicate Lead
Given Click on Leads
Given Click on Find Leads
Given Type Phone Number '99'
Given Click on Find Leads Button
Given Click on Duplicate Lead Button
When Click on submit Button
Then Duplicate lead created

