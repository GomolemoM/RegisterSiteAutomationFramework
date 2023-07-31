#Author: Gomolemo Molotsane

Feature: Registering users


  Scenario Outline: Registering form1
    When table and details show
    Then user click add user button
    Then user enters "<firstname>" and "<lastname>" and "<username>" and "<password>"
    Then user select companyAAA
    Then user select role
    Then user enters "<email>"
    Then user enter <cell>
    Then user click savebtn
    Then user is on home page
    Then click searchone
    Then input search one
    Then get username



    Examples:
      | firstname | lastname | username | password | email          | cell
      | Fname1    | Lname1   | MissGee  | Pass1    | admin@mail.com | 082555



  Scenario Outline: Registering Form2
  // Given user is already on site
    Then user click add user button
    Then user enters "<firstname2>" and "<lastname2>" and "<nickname>" and "<password2>"
    Then user select companyBBB
    Then user select role as customer
    Then user enters "<email2>"
    Then user enter <cell2>
    Then user click savebtn
    Then user is on home page
    Then click searchtwo
    Then input search two
    Then getusernametwo


    Examples:
      | firstname2 | lastname2 | nickname | password2 | email2            | cell2
      | Fname2     | Lname2    | MrTumiso  | Pass2    | customer@mail.com | 082444



