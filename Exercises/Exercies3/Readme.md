# JavaFX Calculator

## Overview
This JavaFX Calculator is a desktop application that enables users to perform basic arithmetic calculations. It features a user-friendly interface with buttons for digits, basic operations, and an easy-to-read display.

## Features

- Basic arithmetic operations (addition, subtraction, multiplication, division)
- Decimal point entry for non-integer numbers
- Clear entry (CE) and clear all (C) options
- Error handling for division by zero

## Prerequisites

- Java Runtime Environment (JRE) and Java Development Kit (JDK) 8 or later
- JavaFX SDK (compatible with your JDK version)

## Installation

1. Open the project in your preferred Java IDE that supports JavaFX.
2. Ensure JavaFX SDK is configured in the IDE's project structure. 

## Configuration
To run the JavaFX Calculator, configure the VM options for your IDE run/debug configurations:

For IntelliJ IDEA:

Go to Run -> Edit Configurations.
Select your Main class configuration.
In the VM options field, enter:
```
--module-path "/path/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml
```
Make sure to replace "/path/to/javafx-sdk/lib" with the actual path to the JavaFX SDK libraries on your system.

## Instruction
To use the calculator, follow these steps:

1. Launch the application by running the Main class.
2. Click on the calculator buttons to input your calculation.
3. View the result in the display area.






