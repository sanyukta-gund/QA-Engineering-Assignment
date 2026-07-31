# QA Engineering Take-Home Assignment

## Overview

This repository contains the solutions for the QA Engineering Take-Home Assignment. The project includes automation frameworks for both Web and Mobile applications developed using industry-standard tools and best practices.

The frameworks are designed using the **Page Object Model (POM)** to ensure maintainability, scalability, and code reusability.

---

## Technology Stack

### Web Automation

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

### Mobile Automation

- Java
- Appium
- UiAutomator2
- TestNG
- Maven
- Android Emulator
- Page Object Model (POM)

---

## Project Structure

```
QA-Engineering-Assignment
│
├── Web-automation
│   ├── src
│   ├── pom.xml
│   └── testng.xml
│
├── MobileAutomation
│   ├── src
│   ├── pom.xml
│   └── testng.xml
│
└── README.md
```

---

## Prerequisites

Install the following software before executing the tests:

- Java JDK 21+
- Maven 3.9+
- Eclipse IDE
- Android Studio
- Android SDK
- Android Emulator
- Node.js
- Appium Server 3.x
- Appium Inspector (Optional)

---

## Web Automation Execution

Navigate to the Web Automation project.

Run:

```bash
mvn clean test
```

Or execute the TestNG suite directly from Eclipse.

---

## Mobile Automation Execution

### Start the Android Emulator

### Start the Appium Server

```bash
appium
```

Navigate to the Mobile Automation project.

Run:

```bash
mvn clean test
```

Or execute the TestNG suite directly from Eclipse.

---

## Framework Features

- Page Object Model (POM)
- Explicit Waits
- Driver Factory
- Base Test
- Utility Classes
- Reusable Methods
- TestNG Framework
- Maven Dependency Management

---

## Automated Test Scenarios

### Web Automation

- User Login
- Product Validation
- Add Product to Cart
- Logout

### Mobile Automation

- User Login
- Product Validation
- Navigation Validation
- Add Product to Cart


## Author

**Sanyukta Gund**

QA Engineer
