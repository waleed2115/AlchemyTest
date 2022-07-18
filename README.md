# AirLift-Tech Functional Automation

Automation Test For Alchemy:

-   [Java](https://www.java.com/en/)
-   [Cucumber](https://cucumber.io/) - BDD/Gherkin
-   [Maven](https://maven.apache.org/) - Dependency Management
-   [Selenium](https://www.selenium.dev/) - Automation for Web
-   [Rest-assured](https://rest-assured.io/) - Automation for API

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for
development and testing purposes. See below instructions on how to setup the project on your local
environment.

### Prerequisites(Basic)

-   Java JDK 15(set JAVA_HOME environment variable)
-   IntelliJ
-   git

### Prerequisites(Mobile)

-   Android Studio SDK(set ANDROID_HOME environment variable)
-   Appium
    -   [Setup Guide](https://docs.google.com/document/d/15foVRn3y6qxLVZxRNSVGiZUbabzawubi9e6IgXvGM1E)

## Running the tests

-   Setup and Install the below plugins in IntelliJ IDEA.

| Plugin                                                                           |
| -------------------------------------------------------------------------------- |
| [Cucumber For Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) |
| [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin)                     |

-   Clone and open the project in IntelliJ using `pom.xml` file

```
git clone git@github.com:waleed2115/AlchemyTest.git
git checkout develop
```

-   Select relevant JDK in IntelliJ

```
  Go to File -> Project Structure
  Go to Project Settings -> Project
  Select Java JDK 15 under Project SDK
```

-   Add Glue Option

```
Go to Run -> Edit configurations
Edit configuration template -> Cucumber Java
In glue field add a single dot(.) in end -> Click on apply and OK.
```

-   Finally, select the desired feature file and Run. Can also be executed using the `Runner.java`
    file.
