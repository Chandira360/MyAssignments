Feature: edit account name feature in salesforce application.
@staticParameter @editAccount
Scenario: edit account name scenario in salesforce application.

Given Login the salesforce application
When click the app launcher icon.
When select view all.
When click accounts
Given search the unique name.
When click the dropdown and select edit.
Given set type to Technology partner
Given set industry to healthcare
Given enter the billing address as 'Salem'
Given enter the shipping address as 'Chennai'
When set customer priority to low
When set SLA to silver
When set active to no
Given enter unique phonenumber as '989'
When set upsell opportunity to no
When click save and verify phno