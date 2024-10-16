Feature: Create Multi lead
Scenario Outline: Create lead with multiple data

Given launch the browser and load url
And enter username
And enter password
When click on the log in button 
Then verify whether the log in is successful
When click on the crmsfa button
When click on the leads button
When click on create lead button
And enter company name <cname>
And enter first name <fname>
And enter last name <lname>
And enter phone number <phno>
When click the submit button

Examples:
|cname|fname|lname|phno|
|Testleaf|Hari|R|99|
|Qeagle|Gokul|S|98|