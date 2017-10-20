Feature: Working with Iron

Scenario: Order new service process.
Given Open "https://portal.ironcloud.dynagility.us"
And Login site by "manager@dynagility.com" and "Iron123456" account.
And Go to Service Catalog screen.
And Take searchs with keyword "Truyen" and go to service detail
And Take order new service with email "kieu@yopmail.com".
And Open "https://admin.ironcloud.dynagility.us/"
And Login site by "sales@dynagility.com" and "Iron123456" account.
And Go to notification screen.
And Approve service request.
