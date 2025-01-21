Feature: CreateLead feature in Leaftaps Application


 @CreateAccountLead@Account
Scenario Outline: Creating a lead scenario with valid data



When click on the create lead link
Given enter the company name as <cname>
And enter the first name as <fname>
And enter the last name as <lname>

When click on submit button
Then verify the lead is created

Examples:
|cname|fname|lname|
|'TestLeaf'|'Gokul'|'Sekar'|
|'Qeagle'|'Babu'|'M'|
|'TestLeaf'|'Hari'|'R'|