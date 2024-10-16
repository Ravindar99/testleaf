Feature: Login feature
Scenario: Login with valid credentials


And enter username 'DemoSalesManager'
And enter password 'crmsfa'
When click on the log in button 
Then verify whether the log in is successful

Scenario: Login with Invalid credentials


And enter username 'crmsfa'
And enter password 'DemoSalesManager'
When click on the log in button 
But verify whether the log in is unsuccessful