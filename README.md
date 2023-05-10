# JBehave-Project

SET UP FOR RUNNING JBEHAVE TESTS

Step 1 To install the JBehave Eclipse plugin, please follow these instructions https://www.testingdocs.com/installing-jbehave-eclipse-plugin/ 

Step 2: Import the JBehaveProjectTest by click File -> Open project from your System

 	At "src/test/java/gg.example.jBehaveProjectTest" has 3 main files that are:

		+ ggSeach.story   This file contains the scenarios written base on JBehave
		+ ggSearchStep.java - This file contains the steps to perform the story
		+ Runner.java - This file builds your test run

Step 3: Go to the ggSearchStep.java to edit your driver path. You can download the driver from https://chromedriver.chromium.org/downloads

Step 4: Right-click the Runner.java -> click Run as and then select JUnit Test to run the test
