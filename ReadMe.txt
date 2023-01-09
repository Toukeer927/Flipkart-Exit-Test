------------------------------Flipkart-----------------------------------

In this e- commerce WebSite I have check the different functionalities via Automation I have test this WebSite with the help of some tools and frameworks.like i have checked login functionality Add to cart functionality etc.
also i have used some different methods to write our test cases.

•Selenium
•Java
•TestNG
•Maven
•Selenium Webdriver

#Requirements
In order to utilize this project you need to create a Maven project in Eclipse IDE
Maven 3
Chrome and ChromeDriver (UI tests use Chrome by default, can be changed in config)
Java 1.8
 In this maven project you have to setup the project after that create some maven dependencies in POM.xl file
through maven repository.After that installed those dependencies in our project and use it.

Also i have used the selenium jars in this project in order to run these test cases so first you have download these jars in after that copy these jars in our project liberaries which is present inside in build path.

for generating extent report you have to the dependency in order to make a report so go to google and download extent report dependency and copy these dependencyin POM.xml
--Concept Included--

Parallel test runs
Dependency injection
Page Object pattern
Common web page interaction methods
Externalize test configuration
Commonly used test utility classes
Simple security tests

--Extent Reporting//Report--

Reporting
Reports for each module are written into their respective /target directories after a successful run


i have putting failed screenshots in separate folder name of the folder is screenshot.

For ExtentReport  -- 

My project Report  is present in this link.
C:\Users\mohdtoukeer\eclipse-workspace\Flipkart\testng.xml


--This Project is also able to run through BatchFile.
Flipkart WebSite Automation Suite Information:-

To run the Flipkart Automation Suite from command line in project folder
call mvn test
TestNG file description
TestNG.xml - defines the all test related
--Packages description--

HomePages Package : Defines all the pages actions and the respective object repository

BaseTest Package: Defines all the pages tests and assertions.

BasePage Package : Defines all the utilities for the tests

Headless Mode
There are Option to run in Headless Mode by writing headless in config.properties file
--Tests.Java files description

BaseTest :- The main class which defines - @BeforeMethod - to open the browser and get the URL - @AfterMethod -logger and to quit the browser - @BeforeSuite - to implement extent report - @AfterSuite - to impliment to close the extent report
Test1_VerifyPageTest :-Includes Test -to verify title page and Logo

Test2_HomePageTest :- Includes Test - to verify the login with valid credentials - to verify the login with invalid credentials and more Test Cases

Test3_GroceryPageTest :- Includes Test - to verify the Grocery page,add item functionality and add card product functionality and also valid product showing in grocery shop

Test4_HeadersPageTest :- Includes Test - to verify the Headers like Electronics,top offer and became Seller link with proper assertions

Test4_HeadersPageTest :- Includes Test - to verify the Headers like Electronics,top offer and became Seller link with proper assertions

Test_5NavigatorPageTest :- Includes Test -to verify left and right navigation click on HomePage

Test6_FooterPageTest :- Includes Test - to verify the valid FaQ and Social Page
 

Test4_HeadersPageTest :- Includes Test - to verify the Headers like Electronics,top offer and became Seller link with proper assertions



###Other files description

Screenshot.java : Defines function to take screenshot

Resources : Read the properties and common global test data from config.properties & Log4j2 logger used to implemented logging from log4j2.properties

ExcelSheet : Read all the test data from data excel file

Reports : show the report from extentReport.html

FailedScreenshot : failed screenshot are placed in FailedScreenshotReport

Drivers : Defines all the driver (Chrome, Firefox, Edge Explorer)

Integrated Test Suite with jenkins and Github


###Reports & Screenshots

Extent Report gets generated after the run under Reports\ExtentReport.html
Screenshots gets placed under \FailedScreenShotReport folder with testname