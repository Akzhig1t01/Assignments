Assignment 1 - Student Management System
A practical project focused on Java OOP fundamentals. This program demonstrates how to work with classes, objects, and data arrays effectively.

Project Description
The project implements logic for managing a list of students and analyzing their academic performance.

Key Features:
Data Management: Creating student objects with Name, ID, and GPA fields.

Composition: The Course class manages an internal array of Student objects.

Performance Analysis:

Calculation of the average GPA for the entire course.

Searching for the student with the highest score.

Counting "Honors" students (those with a GPA ≥ 3.5).

Structure
Student.java — Data model for a student, including the logic for textual representation (toString) and "Honors" status.

Course.java — Manages the array of students and performs group-based calculations.

Main.java — Entry point of the program. It initializes test data and demonstrates static analysis methods.

How to Run
Open the project in IntelliJ IDEA and run the main method in Main.java. The calculation results will be displayed in the console.

Reflection
During this assignment, I strengthened my skills in using Encapsulation and Composition in Java. The most challenging part was managing the interaction between the Student and Course classes through arrays of objects. Using private access modifiers helped protect the data from direct modification, making the code more reliable and well-structured.