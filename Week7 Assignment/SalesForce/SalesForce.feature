Feature: create account feature in salesforce application

Scenario: create acconut scenario with valid name and ownership

Given login the salesforce application
When click on the toggle menu button
When select viewall
When click on sales
When click on Accounts tab
When click on new 
Given enter account name
Given give ownership
When click save
Then Verify Account Name

