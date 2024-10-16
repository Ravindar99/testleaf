Feature: Create lead
Scenario: Create lead with given data

Given launch the browser and load url
And enter username
And enter password
When click on the log in button 
Then verify whether the log in is successful
When click on the crmsfa button
When click on the leads button
When click on create lead button
And enter company name 'TestLeaf'
And enter first name 'Hari'
And enter last name 'R'
When click submit button

Scenario: Create lead with given data
Given launch the browser and load url
And enter username
And enter password
When click on the log in button 
Then verify whether the log in is successful
When click on the crmsfa button
When click on the leads button
When click on create lead button
And enter company name 'Qeagle'
And enter first name 'Gokul'
And enter last name 's'
When click submit button
