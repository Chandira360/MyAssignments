Feature: deleteLead feature in Leaftaps Application


 @DeleteLead @Account
Scenario Outline: Deleting a lead scenario with valid data



When click on the Find leads link
When click on phone-tab
Given enter the phone number as <phno>
When click on Find-Lead button
When click on First-link
When click on Delete button
When click on Find Lead 
Given enter  leadID deleted before and find

Then Verify the records 



Examples:
|phno|
|'99'|
|'98'|
|'97'|