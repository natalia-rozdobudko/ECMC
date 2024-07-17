# ECMC Automation Project

This project is created for interview purposes to demonstrate the approach for automating test cases on a sample website. The project automates three test cases using Selenium and Cucumber.

## Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Running the Tests](#running-the-tests)
- [Dependencies](#dependencies)

## Introduction

The ECMC Automation Project is designed to showcase the automation of three specific test cases as requested. The project is implemented in Java using Selenium WebDriver for browser automation and Cucumber for behavior-driven development (BDD).

The website under test can be accessed [here](https://interview-app-plum.vercel.app/).

## Project Structure

The project follows a structured approach with a clear separation of concerns, organized into the following directories:

- **src/test/java/pages**: Contains the Page Object Model (POM) classes representing different web pages.
    - `BasePage.java`
    - `ContactUsPage.java`
    - `HomePage.java`
    - `WaitingPage.java`

- **src/test/java/runners**: Contains the test runners to execute Cucumber tests.
    - `CucumberRunner.java`

- **src/test/java/step_definitions**: Contains the step definition classes for Cucumber.
    - `ContactUs_stepDefs.java`
    - `Hooks.java`
    - `Waiting_stepDefs.java`

- **src/test/java/utilities**: Contains utility classes for browser configuration, reading properties, and managing drivers.
    - `BrowserUtilities.java`
    - `ConfigurationReader.java`
    - `Driver.java`

- **src/test/resources/features**: Contains the feature files for Cucumber.
    - `ContactUs.feature`
    - `Waiting.feature`

- `configuration.properties`: Configuration file for test settings.
- `pom.xml`: Maven configuration file with all dependencies.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/natalia-rozdobudko/ECMC.git
    ```

2. Navigate to the project directory:
    ```bash
    cd ECMC
    ```

3. Install the necessary dependencies:
    ```bash
    mvn install
    ```

## Running the Tests

1. Ensure the test settings are configured correctly in the `configuration.properties` file.

2. To run the tests using Maven, execute:
    ```bash
    mvn test
    ```

3. Test reports can be found in the `target/cucumber.report` directory.

## Dependencies

All required dependencies are specified in the `pom.xml` file. Key dependencies include:

- Selenium WebDriver
- Cucumber
- JUnit

Thank you for reviewing the ECMC Automation Project. I hope this project demonstrates my approach to efficient and reliable test automation.
