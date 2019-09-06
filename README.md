# FacebookTest
FacebookTest for Selenium

Negative test.

Summary: During log in to Facebook with wrong credentials we are receiving error message.

1 - Open browser
2 - Navigate to https://www.google.com
3 - Enter " Facebook " in to search field
4 - Click "Search" button
5 - Click link "Facebook - Log In or Sign Up"
6 - Verify that you were redirected to "https://www.facebook.com" 
7 - Enter wrong email (text field "Email or Phone"). For example: "badlogin"
8 - Enter wrong password (text field "Password"). For example: "badpassword"
9 - Click "Log In" button
10 - verify that message "The email or phone number you’ve entered doesn’t match any account." is displayed.
