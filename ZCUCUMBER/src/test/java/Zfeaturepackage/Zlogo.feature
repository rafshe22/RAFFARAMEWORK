Feature: Testing of website
Scenario: On website and store google logo
Given Go website "www.google.com"
When Search google logo webelement
Then  Display google logo webelement 
