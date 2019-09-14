Feature: This is to login and logout feature to gmail
Scenario: 1.This is login sceanrio
Given user is on the login page
When the user enters the valid input "Admin" and "admin123"
And clicks on the login button
Then the user should be navigated to homelogin
And clicking on logout user should be loggued out successfully

