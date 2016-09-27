Feature:  Checking  different  values on the form of http://parsleyjs.org/doc/examples/simple.html
  Background:
    Given : I'm on  the site http://parsleyjs.org/doc/examples/simple.html

  Scenario:  When all the field are empty the message should be This form seems to be invalid :(
    When : I press the button  Validate
    Then : I see the message "This form seems to be invalid :("
    And : I close the browser

  Scenario:  When There are only two   fields with information  the message should be This form seems to be invalid :(
    When : I fill out  the field  name
    And :  I fill out  the field  email
    And : I press the button  Validate
    Then : I see the message "This form seems to be invalid :("
    And : I close the browser
