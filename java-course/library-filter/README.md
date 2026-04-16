# 📚 Library Filter

A Java command-line application for book registration and filtering,
developed to practice Object-Oriented Programming, list manipulation
and console input handling.

## ✨ Features

- **Dynamic Registration** → User defines how many books to register
- **List Storage** → Uses ArrayList to manage objects in memory
- **Smart Filtering** → Displays only books published after the year 2000
- **Buffer Management** → Proper Scanner handling for multi-word inputs

## 🛠️ Tech Stack

- Java 21
- OOP principles
- java.util.ArrayList

## 📂 Project Structure
library-filter/
├── src/
│   ├── Book.java      → Object model (Title, Author, Year)
│   └── Program.java   → Main class with execution logic

## 🏁 How to Run

```bash
# Clone the repository
git clone https://github.com/Wgaabs/java-studies.git

# Navigate to the project
cd java-course/library-filter

# Compile
javac src/Book.java src/Program.java

# Run
java -cp src Program
```

## 📝 Example
Enter the number of books: 3
Title: Clean Code
Author: Robert Martin
Year: 2008
Title: Java 1.0 Guide
Author: James Gosling
Year: 1996
Title: Effective Java
Author: Joshua Bloch
Year: 2001
Books published after 2000:
Clean Code - Robert Martin (2008)
Effective Java - Joshua Bloch (2001)

## 📌 Concepts Applied

- Classes and encapsulation
- Constructors and getters
- ArrayList and for-each loop
- Scanner input with buffer management
- Conditional filtering

---
*Part of my Java learning journey — github.com/Wgaabs*