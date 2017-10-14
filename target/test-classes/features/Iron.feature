Feature: Working with Iron

Scenario Outline: Working util customer is happy.
Given Open "<url>"
And Login site by "<username>" and "<password>" account.
And Click on Login button

Examples: 
|url                                   |username              |password  |
|https://portal.ironcloud.dynagility.us|manager@dynagility.com|Iron123456|
|https://portal.ironcloud.dynagility.us|customer@dynagility.com|Iron123456|
|https://admin.ironcloud.dynagility.us |sysadmin@dynagility.com|Iron123456|
|https://admin.ironcloud.dynagility.us |sales@dynagility.com   |Iron123456|
|https://admin.ironcloud.dynagility.us |marketing@dynagility.com|Iron123456|





