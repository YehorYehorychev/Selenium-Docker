# Selenium Test Automation Framework with Docker, Jenkins and AWS

## Overview
This framework is designed to streamline Selenium test automation by leveraging Docker containers and Jenkins pipelines. It enables efficient and scalable test execution, reducing the hassle of infrastructure management.

## Prerequisites
To use this framework, you should have knowledge of the following:

- Java
- Selenium
- Maven
- Git
- TestNG
- Docker
- Jenkins

## Key Features

## Efficient Testing
Run Selenium tests within Docker containers, eliminating the need for manual infrastructure management. This framework automates the setup and execution of tests, saving time and resources.

## On-Demand Selenium Grid
Bring up Selenium Grid infrastructure as needed and run multiple test suites in parallel. This ensures that you can scale your testing efforts without worrying about infrastructure limitations.

## Cloud Testing
Execute tests on AWS, utilizing spot instances and AMI creation for cost-effective and scalable testing. This framework integrates seamlessly with AWS, allowing you to leverage cloud resources for your testing needs.

## Docker Compose
Streamline container orchestration with Docker Compose. This tool allows you to define and run multi-container Docker applications, making it easier to manage your test environment.

## Selenium Grid
My framework provides a simplified approach to configuring and managing Selenium Grid, ensuring that you can run tests in parallel across multiple browsers.

## Custom Image Creation and Jenkins Pipelines
Create custom Docker images and automate workflows with Jenkins pipelines. This framework integrates with Jenkins, allowing you to define and execute CI/CD pipelines for your test automation projects.

## AWS Integration
Execute automated tests on AWS with spot instances and AMI creation. This framework integrates with AWS, allowing you to run tests in the cloud and utilize AWS resources for scalable testing.

## Archiving Results
Archive test results via Jenkins in the cloud. This framework provides mechanisms for storing and accessing test results, ensuring that you can review and analyze your test outcomes.

# Running Tests 🚀

### TestNG parameters

- Running a test suite

`java -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml`

- Running a test suite with specific thread count

`java -cp 'libs/*' org.testng.TestNG -threadcount 2 test-suites/flight-reservation.xml`

- TestNG by default creates **test-output** directory. You can change it with **-d** option.

`java -cp 'libs/*' org.testng.TestNG -threadcount 2 -d result test-suites/flight-reservation.xml`

---

### System Properties

- To pass the browser option

`java -Dbrowser=chrome -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml`

- To run the tests using Selenium Grid

`java -Dselenium.grid.enabled=true -Dselenium.grid.hubHost=localhost -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml`

- To run the tests using Selenium Grid with specific thread count

`java -Dselenium.grid.enabled=true -Dselenium.grid.hubHost=localhost -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml -threadcount 2`

*Feel free to explore and contribute to the repository. For any questions or support, please refer to the documentation or raise an issue in the repository.*
