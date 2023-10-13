
Feature: User should be able to open this site: https://derivfe.github.io/qa-test/settings on mobile responsive mode and verify profile setting form
  
  Scenario Outline: Settings - Profile - Verify Valid Scenarios of website https://derivfe.github.io/qa-test/settings
  When Open on mobile Chrome Browser and launch the application
  Then Enter on mobile Firstname "<firstname>" and Lastname "<lastname>" Address "<address>" DOB "<dob>" Email "<email>" State "<state>" City "<city>" ZipCode "<zipcode>" MobNum "<mobilenumber>" WebDescription "<webdescription>"
  And Observe the landing page for any responsive issue and verify the profile setting form
    Examples:
    |firstname|lastname|address|dob|email|state|city|zipcode|mobilenumber|webdescription|
   	|Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal||04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862||


  Scenario Outline: Settings - Profile - Verify Invalid Scenarios of website https://derivfe.github.io/qa-test/settings
  When Open on mobile Chrome Browser and launch the application
  Then Enter on mobile Firstname "<firstname>" and Lastname "<lastname>" Address "<address>" DOB "<dob>" Email "<email>" State "<state>" City "<city>" ZipCode "<zipcode>" MobNum "<mobilenumber>" WebDescription "<webdescription>"
  And Observe the landing page for any responsive issue and verify the profile setting form
    Examples:
    |firstname|lastname|address|dob|email|state|city|zipcode|mobilenumber|webdescription|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|3020211|09509555862|itisnewone|
    ||Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu||Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201||jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981||Rajasthan|jaipur|302021|9509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com||Jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan||967677|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur||09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|967677||itisnewone|
    |9887666|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|4444444|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-2|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|30-12-2023|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|30-13-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|32-12-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|31-04-198145|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail..|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail..com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|@.|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal20052002@gmail.com.|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal.20052002@gmail.com|Rajasthan|jaipur|302021|00000009509555862000000045645656546|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal.20052002@gmail.com|Rajasthan|jaipur|302021|++000000095|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal.20052002@gmail.com|Rajasthan|jaipur|302021|++$$$$$$$$$|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal.20052002@gmail.com|Rajasthan|jaipur|302021|645656546++|itisnewone|
    |Jitendra|Agrawal|Flatno201|04-11-1981|jkagrawal.20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
		 |Jitu$|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
		 |Jitu|$Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
		 |Jitu|Agrawal|$Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
		 |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|$Rajasthan|jaipur|302021|09509555862|itisnewone|
		 |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|$jaipur|302021|09509555862|itisnewone|
		 |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|$30202|09509555862|itisnewone|
		 |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|$9509555862|itisnewone|
		 |Jitu|Agrawal|Flatno201|11-04-1981|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|$itisnewone|
		 |Jitu|Agrawal|Flatno201|11/04/458145|jkagrawal20052002@gmail.com|Rajasthan|jaipur|302021|09509555862|itisnewone|
		 
     |@#@$#@$$$#$#$|#$#@$#@$#@$#$|#$#@$#@$#@$|04/11/1981|jkagrawal20052002@gmail.com|#$#@$#@$#@$#@$#@|#$#@$#@$#$edf|#@$#@$|@#$#@$#@$#@|#$#@$#@$##$|


  Scenario Outline: Settings - Security - Verify Valid Scenarios of website https://derivfe.github.io/qa-test/settings
  When Open on mobile Chrome Browser and launch the application
  Then Enter on mobile Newpassword "<Newpassword>" and Repeatpassword "<repeatnewpassword>" humannumber "<humannumber>"
  And Observe the landing page for any responsive issue and verify the Security setting form
    Examples:
    |Newpassword|repeatnewpassword|humannumber|
    |jitu|jitu|13|
    |jitu|jitu|14|
    |jitu|jitu|12|
    |jituu|jitu|13|
    |jitu|jituu|13|
    |jitu@123|jitu@123|13|
    ||jitu@123|13|
    |jitu@123||13|
    |||13|
    |jitu@123|jitu@123||
    ||||
    
    
     Scenario Outline: Terms - Contact Us - Verify Valid Scenarios of website https://derivfe.github.io/qa-test/settings
  When Open on mobile Chrome Browser and launch the application
  Then Enter on mobile TermsName "<name>" and TermsEmail "<email>" TermsPhone "<phone>" TermsMsg "<msg>"
  And Observe the landing page for any responsive issue and verify the Terms setting form
    Examples:
    |name|email|phone|msg|
    |Jitendra|jkagrawal@test.com|09509555862|it is new one|
    ||jkagrawal@test.com|09509555862|please give me reply|
    |Jitendra||09509555862|Please i did not get reply on previous mail|
    |Jitendra|jkagrawal@test.com||I waiting for reply for some questions|
    |Jitendra|%jkagrawal@test.com|09509555862|Please Give me Answers below questions|
    |Jitendra|@test.com|09509555862|Still i am waiting|
    |Jitendra|jkagrawaltest.com|09509555862|Thanks u for your support|
    |Jitendra Agrawal|jkagrawal@test|09509555862||
    |Jitendra|jkagrawal@.com|09509555862|Waiting|
    |Jitendra|jkagrawal@test.|09509555862|Still waiting|
    |Jitendra|jkagrawal@test..com|09509555862|Thanks u So Much|
    |Jitendra|jkagrawal@test.com|09509555862877867676|I am available today|
    |Jitendra|jkagrawal@test.com|09509555862|Please call me day after tomorrow.i am busy with some urgent Task|
   
    
    