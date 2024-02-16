Feature: Sanity testing for Fnp.AE
Background: 
Given user are already in home page
@sanity1
Scenario: To verify that user is able to login from Account section using Google account
When user click on Account button
And click on login button
And Login using Google account
And Enter email-Id  as a "shubham.th@fnp.com"
And Click on Next button
And Enter Password as a "Generation@2024"
And Click On Next button
Then login done successfully and user land on my account page as "Account My Account - FNP"
@sanity2
Scenario:To verify that user is able to login from Account section using Normal Id flow
When user click on Account button
And click on login button
And Enter valid Email Id as a "shubham@gmail.com"
And Click on continue button
And Enter valid Password "Shubham@123"
And after enter password click on continue 
Then login done successfully and user land on my account page as "Account My Account - FNP"
@sanity3
Scenario: To verify that user is able to login from checkout flow using google account
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue

@sanity4
Scenario: To Verify & check if user is able to add the item and delete the item from the cart 
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on Add to cart button
And Click on continue without add-ons
And Click on delete icon in my cart
And Click on yes in the pop-up
@sanity5
Scenario: To verify the user is able to search any product from the home page and PLP page and PDP page
When user land on home page search "cake" product
And when user land on PLP page Search "plant" 
And click on any plant product in PLP page and navigate to PDP page
Then user is able to search "cake" product in PDP page
@sanity6
Scenario: To verify user is able to click static pages on the fotter section
When user land on home page scroll the page to the fotter
And user is able to click on About us
And user is able to click on contact us
And user is able to click on Tearms & Conditions
@sanity7
Scenario: To verify user is able to click help icon in home page
When user click on header part of the help icon 
Then verify the contact us page should be open
@sanity8
Scenario: To verify user is able to create and delete the remainder
	When user click on Account button
And click on login button
And Enter valid Email Id as a "shubham@gmail.com"
And Click on continue button
And Enter valid Password "Shubham@123"
And after enter password click on continue 
And user click on my remainder
And enter name as a "Fnp"
And enter occasion as a "Anniversary"
And pick a date
And Click on save occasion
And click on delete icon on the created remainder
And click on ok then the remainder delete successfully
@sanity9
Scenario: To verify that user is able to place the oder
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Enter name as a "Shubh" in the address
And Enter recipient address as a "Delhi"
And Enter mobile number as a "1234567890"
And Click on save and deliver here
And Click on proceed to payment button
And Select COD payment option
Then user land on Thank you page as "https://uat.fnp.ae/control/order-confirmation"
@sanity10
Scenario: user is able to add free message card
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on free message card
And Select occasion
And Select message on card
And Add receiver name as a "ABC"
And Click on save button
Then validate message is saved
@sanity11
Scenario: user is able to edit Address details in DA page
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
When User click on address edit button
And Update the name as a "QA"
And update the recipients address as a "New Delhi"
And Click on save 
@sanity12
Scenario: User is able to edit the sender details
When user click on Account button
And click on login button
And Enter valid Email Id as a "shubham@gmail.com"
And Click on continue button
And Enter valid Password "Shubham@123"
And after enter password click on continue 
When User click on edit icon in my profile
And Update the name as "ABCD"
And Update the mobile number as a "9898989898"
And Click on save btn
@sanity13
Scenario: User is able to add the coupon code
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on coupon
And Enter coupon code as a "CART10"
And Click on apply
@sanity14
Scenario: To verify that user is able to create PNC using Credit Card
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on proceed to payment button
And select Credit Card payment option
And enter card number as a "4242424242424242"
And Enter card name as a "Shubham"
And select month and year as a "225"
And Enter Cvv as a "123"
And click on pay
Then verify that user land on PNC page as a "Oops! Payment not confirmed!"
@sanity15
Scenario: To verify that user is able to add new address
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Enter name as a "Shubh" in the address
And Enter recipient address as a "Delhi"
And Enter mobile number as a "1234567890"
And Click on save and deliver here
@sanity16
Scenario: To verify user is able to select any search option from drop down
When user click on search box
And search "plant"
And select Air Purifying Plants
Then veriy user is able to land on "https://uat.fnp.ae/air-purifying-n-stress-relieving-plants?s=autosuggestion" page
@sanity17
Scenario: To verify if user is ablet ot switch from Enlish to Arbic site
When user click on Arabic switch button
Then user should redirect to Arabic site "https://uat.fnp.ae/ar/"
@sanity18
Scenario: To verify if user able to add add-ons from DA page
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And click on add button to add add-ons
Then verify add-ons is increased

@sanity19
Scenario:To verify that user is able to login from Account section using Normal Id flow
When user click on Account button
And click on login button
And Enter valid Email Id as a "shubham@gmail.com"
And Click on continue button
And Enter valid Password "Shubham@123"
And after enter password click on continue 
Then login done successfully and user land on my account page as "Account My Account - FNP"
And click on Sign-out button
Then verify user will be sucessfully logged out "https://uat.fnp.ae/"
@sanity20
Scenario: To verify that user is able to make PNC from Paypal
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "aman.t.varshney@gmail.com"
And click on continue
And Enter password as a "popper@123"
And click on continue
And Click on proceed to payment button
And Click on Paypal Payment Option
And Click on Paypal Checkout button
Then Click on close button to create PNC
Then verify that user land on PNC page as a "Oops! Payment not confirmed!"
@sanity21
Scenario: To verify that user is able to delete product from DA page
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "aman.t.varshney@gmail.com"
And click on continue
And Enter password as a "popper@123"
And click on continue
Then Delete that product from DA page
Then click on yes button from pop-up to delete the product
@sanity22
Scenario: To verify that user is able to create PNC order for a Cake category product
When select cake product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on proceed to payment button
And Click on Paypal Payment Option
And Click on Paypal Checkout button
Then Click on close button to create PNC
Then verify that user land on PNC page as a "Oops! Payment not confirmed!"
@sanity23
Scenario: To verify that user is able to create PNC order for a Flower category product
When click on flower category in home
And Select flower in PLP page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on proceed to payment button
And Click on Paypal Payment Option
And Click on Paypal Checkout button
Then Click on close button to create PNC
Then verify that user land on PNC page as a "Oops! Payment not confirmed!"
@sanity24
Scenario:To verify that user is able to login via New User Normal Flow
When user click on Account button
And click on login button
And Enter valid Email Id as a "aman.t.varshney+e6@gmail.com"
And Click on continue button
Then Fill normal login Name Field as a "Aman test"
Then Fill normal login Mobile No. Field "112233445566"
Then Enter normal login New User password as a "popper@123"
And Click on continue button
@sanity25z
Scenario: To verify that user is able to Sign Up/Registration with new user in checkout page
When select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubhamb5ijk@gmail.com"
And click on continue
Then Fill Name Field as a "Aman test"
Then Fill Mobile No. Field "112233445566"
Then Enter New User password as a "popper@123"
And Click on new user continue button
@sanity26
Scenario: Verify & Check the functionality of editing delivery date and delivery type on DA page
When click on flower category in home
And Select flower in PLP page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on buy now button
And Click on continue without add-ons
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And click on change button in DA page
And change the delivery date in DA page
And change shipping method in DA page
And change the time slot in DA page
@sanity27
Scenario: Verify & check the funtionality of the procced to checkout button from My cart
And select any product from the home page
And select where to location
And select delivery date ,shipping method and Time slot
And Click on Add to cart button
And Click on continue without add-ons
And click on proceed to Payment button in my cart
And Enter valid Email as a "shubham@gmail.com"
And click on continue
And Enter password as a "Shubham@123"
And click on continue
And Click on proceed to payment button
And Click on Paypal Payment Option
And Click on Paypal Checkout button
Then Click on close button to create PNC
Then verify that user land on PNC page as a "Oops! Payment not confirmed!"




