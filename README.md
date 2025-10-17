This project demonstrates Object-Oriented Programming (OOP) and SOLID principles in Java within a small Library Management System.
It also integrates a DevSecOps workflow through GitHub Actions to automatically compile and test the application.

Key Features:
Encapsulation: Private attributes with getters/setters in Book.java.
Inheritance & Polymorphism: EBook and PrintedBook extend Book and override methods.
Abstraction: Abstract class Book defines calculateLateFee().

SOLID Principles:
Single Responsibility – Each class performs a single task.
Interface Segregation – Separate Payment interface.
Dependency Inversion – LibraryApp depends on Payment abstraction.
DevSecOps: GitHub Actions workflow (build.yml) compiles and runs tests automatically.
