Feature: To update an Order
Scenario: Updating the status in order
Given User is in the OrderPage
When User clicks on getThelist button
And User clicks on UpdateOrder
And User will select his respected status
And User will click on the Update button
Then User will navigate backs to the Orderpage and sees the order got updated