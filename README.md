# MorseCodeX — Two-Way Morse Code Translator & Analyzer

## Overview

MorseCodeX is a Java-based application that converts normal text into Morse code and decodes Morse code back into readable text.

The application automatically detects whether the user has entered normal text or Morse code and performs the appropriate conversion.

It also validates the input and provides basic analysis of the entered text or Morse code.

## Features

- Text to Morse code conversion
- Morse code to text conversion
- Automatic input type detection
- Input validation
- Text analysis
- Morse code analysis
- Support for spaces between words
- Modular Java class structure
- Error handling for invalid input

## Technologies Used

- Java
- Java Standard Library
- Object-Oriented Programming concepts
- Arrays
- Strings
- Loops
- Conditional statements
- Methods
- Modular class design

## Project Structure

MorseTranslator/

├── src/
│   ├── Main.java
│   ├── MorseTable.java
│   ├── MorseEncoder.java
│   ├── MorseDecoder.java
│   ├── InputDetector.java
│   ├── Validator.java
│   └── Analyzer.java
│
├── README.md
└── statement.md

## Modules

### Main
Controls the program flow and connects all other modules.

### MorseTable
Stores the Morse code mapping for the English alphabet.

### MorseEncoder
Converts normal text into Morse code.

### MorseDecoder
Converts Morse code back into normal text.

### InputDetector
Determines whether the entered input is text or Morse code.

### Validator
Checks whether the entered input is valid.

### Analyzer
Provides basic statistics about the input.

## How It Works

The application follows this workflow:

User Input
    ↓
Input Detection
    ↓
Input Validation
    ↓
Translation
    ↓
Analysis
    ↓
Output

If normal text is entered:

Text → Validation → Morse Encoder → Morse Code

If Morse code is entered:

Morse Code → Validation → Morse Decoder → Text

## Installation

1. Install Java JDK on your computer.
2. Clone or download this repository.
3. Open the project folder in a terminal.
4. Navigate to the `src` directory.

Example:

cd MorseTranslator/src

## Running the Project

Compile all Java files:

javac *.java

Run the main program:

java Main

The program will ask:

Enter word or Morse code:

### Example 1 — Text Input

Input:

HELLO

Output:

Encoded: .... . .-.. .-.. ---

### Example 2 — Morse Input

Input:

.... . .-.. .-.. ---

Output:

Decoded: HELLO

### Example 3 — Invalid Input

Input:

HELLO123

Output:

Error: Only letters A-Z and spaces are supported.

## Testing

The application can be tested using the following cases:

| Test Case | Input | Expected Result |
|---|---|---|
| Text encoding | HELLO | Morse code |
| Morse decoding | .... . .-.. .-.. --- | HELLO |
| Multiple words | HELLO WORLD | Morse with `/` separator |
| Invalid text | HELLO123 | Error message |
| Empty input | Empty | Error message |
| Invalid Morse | Invalid Morse pattern | Error message |

## Limitations

- Currently supports English alphabet letters A-Z.
- Numbers and punctuation marks are not supported.
- Morse letters should be separated by spaces.
- `/` is used as a word separator.

## Future Enhancements

- Support for numbers and punctuation
- Graphical User Interface
- Morse code audio generation
- Audio-to-Morse decoding
- Translation history
- Additional language support

## Conclusion

MorseCodeX demonstrates how Java can be used to build a modular text-processing application using arrays, strings, loops, conditional statements, methods, validation, and multiple classes.

The project provides both directions of Morse translation while also performing input detection and basic analysis.