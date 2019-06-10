# securePay

### Introduction
This is a page object model framework. All the web-elements of and actions performed on a page are defined and declared into a class file.

Below is the folder structure:
- ./src/main/java/SecurePayTest/**config** - All the config property files.
- ./src/main/java/SecurePayTest/**securePayPO** - All page object files.
- ./src/main/java/SecurePayTest/**tests** - All test files(Test cases/suites).
- ./src/main/java/SecurePayTest/**utilities** - All common/base methods.

#### _Note:_  **Make sure you Maven and TestNG are installed on your Eclipse.**

### Configuring Eclipse
1. Clone/Download the zip into your system.
2. Unzip the folder. (Ignore if cloned)
3. Open Eclipse and Import the project.
   - File->Import->Maven->Existing Maven Projects
4. Click on Next and Choose the cloned/downloaded folder.
5. Select the project list and click on Finish.

### How to Run the Tests:
1. Go to ./src/main/java/SecurePayTest/tests
2. Right click on the "SecurePayContactUsTest.java" file
3. Select "Run As- TestNG Test"


**Possible/Common Error:** TestNG missing. Go to Java Build path and add TestNG library (or) Mouse over on the error in editor and Select "Add TestNG" 

### Libraries/Drivers used and their versions
* Selenium - 3.141.59
* TestNG - 6.14.3
* ChromeDriver - 75.0.3770.8 [Compatible with Chrome 75 and above]
* GeckoDriver - 0.24.0 [Compatible with Firefox 57 and above]
* jfairy - 0.6.2 (This library is used to generate random test data)
