# Currency conversion kata

This kata should help you learn tests doubles and Mockito

See [Root README](../README.md) for instructions

## Installation

Windows: 
> gradlew.bat build

Others: 
> ./gradlew build

## Running the test

Your IDE can do it for you. 

Else, for Windows: 
> gradlew.bat test

For others: 
> ./gradlew test

Whenever tests are green, Jacoco will run and output them in `build/reports/jacoco`

## Mutation tests

**Pre-requisite** : Your gradle must run with JVM >= 16, which means :
- that your default JDK is >= 16
- or that you add `org.gradle.java.home=<PATH TO >= 16 JDK>` to your `<HOME>/.gradle/gradle.properties` file.

Windows:
> gradlew.bat pitest

Others:
> ./gradlew pitest

