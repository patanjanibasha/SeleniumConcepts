@tag
Feature: admin login
  I want to use this template for check admin login

  @tag1
  Scenario: Check admin login with valida inputs
    Given open browser with url "http://orangehrm.qedgetech.com"
    Then i shoulb see login page
    When i enter username as "Admin"
    And i enter password as "Qedge123!@#"
    And i click login button 
    Then i should see admin module
    When i click logout button
    Then i shoulb see login page
    When i close the browser

  @tag2
  Scenario Outline: Check admin login with invalida inputs
     Given open browser with url "http://orangehrm.qedgetech.com"
    Then i shoulb see login page
    When i enter username as <username>
    And i enter password as <password>
    And i click login button 
    Then i should see error message
    When i close the browser

    Examples: 
      | username | password | status |
      | Admin | abc | Fail |
      | abc | Qedge123!@# | Fail |
      | Admin | abc | Fail |
      | abc | abc | Fail |