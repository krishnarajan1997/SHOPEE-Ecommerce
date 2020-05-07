Feature: To check the Webpage of the SHOPEE MALL

  
  Scenario: To login the account in shopee
    Given Move to login page
    When Enter the username and password
    And click the login button
    Then check the outcome

  
  Scenario: To get the count of the image ,links,dropdown and Textfield
    Given Write the coding for image and links
    When Write the coding for dropdown and textfield
    And To check all links are broken or not
    Then To check the overcome result

  @sanity
  Scenario: To book the product
    Given to login the account
    When enter the product name and select the product
    And check the price and add the product to cart
    Then Give details and pay
