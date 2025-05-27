
Feature: FNP Order Placement

  Scenario: Verify product with Hand Delivery is added to cart for today's date
    Given the user is on FNP homepage
    When user click on where to location
    And Enter pincode and click on continue
    When user click on plant category from the home page
    And click on best seller plant 	
    And click on first plant product in PLP
    And Click on Hand Delivery if available otherwise click on calendar
    And select today date from the calender
    And Select Delivery Method & Time Slot
    And click on add to cart button
    And click on one product from the add-ons window
    And Click on continue
    Then verify product is successfully added to the cart
    And click on proceed to pay
    And click on login with google
    And Enter email id
    And Click on next
    And Enter password
    And click on continue btn
    And user add delivery address section on DA page and click on proceed to Pay button
    And User select paypal payment option and click on paypal checkout
    And cancel the payment 
    Then verify user land on PNC page
   
   
    