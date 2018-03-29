
#@FunctionalTest
Feature: Men Basketball Test Cases feature


	#@web
	@RegressionTest1
  Scenario: Validate Basketball Search Result Count Verification
    When Open a browser and open Adidas online store site
    Then Verify Adidas online store Home Page
    And Hover over Men Menu
    Then Verify Men Menu opens
    Then Click on Basketball link
    Then verify Men Basketball page appears
    #Then Validate Search Count of Men basketball
    
  @RegressionTest2
  Scenario: Validate Men's Basketball shoes price Low to high filter
    When Open a browser and open Adidas online store site
    Then Verify Adidas online store Home Page
    And Hover over Women Menu
    Then Verify Women Menu opens
    Then Click on T Shirts link
    Then verify Women T Shirt page appears
    #Then Validate Search Count of Women Tshirt
    
  
 
    
    
    
    
    
    
    