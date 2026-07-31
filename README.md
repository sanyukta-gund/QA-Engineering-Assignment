# QA Engineering Assignment

## Overview

This repository contains my submission for the QA Engineering Take-Home Assignment. The solution includes:

- Web UI Automation using Selenium WebDriver
- Mobile App Automation using Appium
- Page Object Model (POM) framework
- TestNG for test execution
- Maven for dependency management

---

# Project Structure

```
QA-Engineering-Assignment
│
├── Web-Automation
│   ├── src/test/java
│   │   ├── base
│   │   ├── pages
│   │   ├── tests
│   │   └── utils
│   ├── pom.xml
│   └── testng.xml
│
├── MobileAutomation
│   ├── src/test/java
│   │   ├── base
│   │   ├── pages
│   │   ├── tests
│   │   └── utils
│   ├── pom.xml
│   └── testng.xml
│
└── README.md
```

---

# Technology Stack

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

---

# Prerequisites

Install the following before running the project:

- Java JDK 21 or above
- Maven
- Eclipse IDE
- Google Chrome
- ChromeDriver (managed automatically by Selenium Manager)
- Node.js
- Appium Server (v3+)
- Android Studio
- Android SDK
- Android Emulator

---

# Web Automation

### Application

https://www.saucedemo.com

### Test Cases Implemented

### Test Case A (Success Path)

- Login with **standard_user**
- Verify the user is redirected to the Inventory/Catalog page.

### Test Case B (Failure Path)

- Login with **locked_out_user**
- Verify the error message:

```
Epic sadface: Sorry, this user has been locked out.
```

---

# Mobile Automation

### Application

Sauce Labs MyDemoApp Android APK

### Automated Scenario

- Launch application
- Open menu
- Navigate to Login
- Login with valid credentials
- Verify Product page is displayed

---

# How to Execute Web Automation

Open terminal inside **Web-Automation**

Run:

```bash
mvn clean test
```

or

```bash
mvn test
```

You can also execute using:

```bash
testng.xml
```

Run As → TestNG Suite

---

# How to Execute Mobile Automation

## Start Appium Server

```bash
appium
```

Verify emulator is connected

```bash
adb devices
```

Open terminal inside **MobileAutomation**

Run:

```bash
mvn clean test
```

or execute

```bash
testng.xml
```

using TestNG.

---

# Framework Design

The framework follows the Page Object Model (POM) design pattern.

Features:

- Reusable Page Objects
- Base Page implementation
- Driver Factory
- Explicit Wait utilities
- TestNG Framework
- Clean and maintainable code structure

---
# Execution Video

Execution Video:
**Loom Link**

for Web Automation
https://www.loom.com/share/8985e0125409414c9df07b48e097458c

for Mobile Automation
https://www.loom.com/share/ab6dfd6635f44122a5d118db7e89dcb1



# Author

**Sanyukta Gund**

QA Engineer


