Feature: Hotel Booking In Addactin Application


Scenario: User Login In The Addactin WebApplication
Given User Launch The Addactin Application
When User Enter the Username In Username Field
And User Enter the Password In Password Field
Then User Click The Login Button And It Navigate To Searc Hotel Page

Scenario: User Search Hotel In This Page
When User Select The Location
And User Select The Hotels
And User Select The Room Type
And User Select The Number Of Rooms
And User Select The Check-In Date
And User Select The Check-Out-Date
And User Select Adults per Room
And User Chilldren per Rooms
Then User Click The Search Button And It Navigates To Select Hotel Page

Scenario: User Selected Hotel In This Page Displayed
When User Select The Radio Button
Then User Click The Continue Button And Its Navigate To Book A Hotel Page

Scenario: In User Book A Hotel Page
When User Enter The First Name
And User Enter The Last Name
And User Enter The Billing Address
And User Enter The Credit Card Number 
And User Enter The Credit Card Type
And User Enter The Expiry Date
And User Enter The Expiry Year
And User Enter The CVV Number
Then User Click The Book And It Navigates To  Select Book Now

Scenario: In The Booking Confirmation
Then User Click Logout And Navigates To Successfully Logout Page