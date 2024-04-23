# Image Management Tool

## Overview
This JavaFX-based Image Management Tool is designed to facilitate the uploading, viewing, and storage of images. It supports various image transformations and displays key attributes of images.

## Key Features

- Provides a user interface for uploading and viewing images seamlessly.
- Displays detailed information about images including their dimensions and file type.
- Enables image conversion to various formats including PNG, JPEG, GIF, and BMP.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Runtime Environment (JRE) and Java Development Kit (JDK), version 8 or later.
- JavaFX runtime libraries included in your project setup.

## Installation Instructions

Download the source code by cloning the repository to your system. If you are using a Java IDE, you should import the project as a JavaFX project.

## Operating Instructions

To run the Image Management Tool, follow these steps:

1. Open the project in your Java IDE.
2. Ensure that the JavaFX SDK is properly configured within your project structure. This includes adding the JavaFX libraries to your project and setting the correct library path.
3. Configure your IDE to include the required VM options for JavaFX. For example, in IntelliJ IDEA:
    - Navigate to the 'Run' menu and select 'Edit Configurations'.
    - Find the 'Application' configurations and locate your `Main` class.
    - In the 'VM options' field, input the following:
      ```
      --module-path "/path/to/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml
      ```
      Replace "/path/to/javafx-sdk/lib" with the actual path to the JavaFX SDK libraries on your machine.
4. Run the `Main` class to launch the application.
5. Click the 'Upload Image' button to begin uploading an image file.
6. The image attributes, such as dimensions and file type, will be displayed within the interface.
7. To convert and save the image in a different format, select the desired format from the dropdown menu and click 'Save Image As...'.






