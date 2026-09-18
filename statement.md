# Project Statement

## Project Title

MorseCodeX — Two-Way Morse Code Translator & Analyzer

## Problem Statement

Morse code is a communication system that represents letters using combinations of dots and dashes. Manually converting between normal text and Morse code can be time-consuming and prone to errors.

MorseCodeX provides a simple Java-based solution that can automatically detect the type of input and perform the required conversion between normal text and Morse code.

## Project Scope

The project focuses on:

- Converting English text into Morse code
- Converting Morse code into English text
- Automatically detecting the input type
- Validating user input
- Providing basic input analysis
- Handling invalid or empty input

The current version supports English alphabet characters A-Z and spaces.

## Target Users

The application can be used by:

- Students learning Morse code
- Beginners interested in encoding and decoding
- Users who need a simple Morse code conversion tool
- Students demonstrating Java programming concepts

## High-Level Features

### 1. Two-Way Translation

The system supports both:

Text → Morse Code

and

Morse Code → Text

### 2. Automatic Input Detection

The application examines the entered characters and determines whether the input is Morse code or normal text.

### 3. Input Validation

The system checks the input before processing it and displays an error when unsupported characters or invalid Morse patterns are entered.

### 4. Input Analysis

The application provides basic statistics such as:

- Number of letters
- Number of words
- Number of dots
- Number of dashes

## Technologies

- Java
- Java Standard Library
- Arrays
- Strings
- Loops
- Conditional Statements
- Methods
- Modular Classes

## Project Modules

The project consists of the following modules:

1. `Main.java` — Controls the overall program flow.
2. `MorseTable.java` — Stores Morse code mappings.
3. `MorseEncoder.java` — Converts text to Morse code.
4. `MorseDecoder.java` — Converts Morse code to text.
5. `InputDetector.java` — Detects the input type.
6. `Validator.java` — Validates user input.
7. `Analyzer.java` — Performs basic input analysis.

## High-Level Workflow

User Input
    ↓
Input Detection
    ↓
Input Validation
    ↓
Encoding / Decoding
    ↓
Analysis
    ↓
Output

## Expected Outcome

The completed system provides a functional two-way Morse code translator with automatic input detection, validation, and basic analysis while demonstrating modular Java programming concepts.