Feature: This is a feature for creating amazon account 

@tag
Scenario: Verify user can not create account with wrong information

Given open <"URL"> em
Then mouse hover on sign in em
Then click start here
Then enter invalid name mobile number enter password repassword click continue
Then Verify user can not create account with wrong information