# Employee Management Automation Framework

A Selenium WebDriver automation project developed using Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

The project automates login functionality for the OrangeHRM Employee Management application.

## Technologies Used

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- IntelliJ IDEA
- Git
- GitHub

## Application Under Test

OrangeHRM Demo Application

The application provides HR management functionality including employee management, leave management, recruitment, and user administration.

## Automated Test Scenarios

### Login Tests

- Verify login with valid credentials
- Verify login with invalid credentials
- Verify successful navigation to the Dashboard

## Project Structure

EmployeeManagementAutomation

    src
    ├── main
    │   └── java
    │       └── pages
    │           ├── LoginPage.java
    │           └── DashboardPage.java
    │
    └── test
        └── java
            ├── base
            │   └── BaseTest.java
            │
            └── tests
                └── LoginTest.java

## Page Object Model

The project follows the Page Object Model design pattern.

Page classes contain:

- Web element locators
- Page-specific actions
- Synchronisation logic

Test classes contain:

- Test scenarios
- TestNG assertions
- Test execution logic

This separation improves code readability, reusability, and maintainability.

## Test Execution Flow

BaseTest
↓
Launch Chrome
↓
Open OrangeHRM
↓
LoginTest
↓
LoginPage
↓
Enter credentials
↓
Click Login
↓
DashboardPage
↓
Verify Dashboard
↓
Test Passed
↓
Close Browser

## Synchronisation

Explicit waits using `WebDriverWait` and `ExpectedConditions` are used to handle dynamic page loading.

This avoids using fixed delays such as `Thread.sleep()`.

## Running the Tests

Tests can be executed directly from IntelliJ using TestNG.

They can also be executed through Maven:

    mvn clean test

## Future Improvements

The framework can be extended to include:

- Employee search
- Add employee
- Edit employee
- Delete employee
- Leave management
- Test data management
- Screenshots on test failure
- TestNG XML suites
- Reporting
- CI/CD integration