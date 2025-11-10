# QAP 3 - Java - Semester 3

This project focuses on applying core object-oriented programming (OOP) concepts through 4 Java Problems.

These problems focus on inheritance, abstraction, polymorphism, and interfaces.

Problem 1 – Inheritance (Person, Student, Teacher, CollegeStudent)
------------------------------------------------------------------
Implements an inheritance hierarchy to model people in an academic environment.

Classes:
- Person (base class)
- Student (extends Person)
- Teacher (extends Person)
- CollegeStudent (extends Student)

Key Concepts:
- Constructor chaining using 'super'
- Getter and setter methods
- Overriding toString() for output formatting
- Demonstration through Demo.java

Problem 2 – Method Overriding and Class Extension
-------------------------------------------------
Introduces a simple two-class model to demonstrate method overriding and encapsulation.

Classes:
- Point (base class with x and y coordinates)
- MovablePoint (extends Point with xSpeed and ySpeed)

Key Concepts:
- @Override annotation
- Access control using getters and setters
- Maintaining encapsulation when modifying private variables
- Tested in Demo.java

Problem 3 – Abstract Classes and Polymorphism
----------------------------------------------
Expands on OOP design with an abstract Shape superclass and multiple shape subclasses.

Classes:
- Shape (abstract)
- Circle
- Ellipse
- Triangle
- EquilateralTriangle

Key Concepts:
- Abstract methods (area and perimeter)
- Constructor validation
- Inheritance of shared attributes
- Storing different shapes in a Shape[] array
- Polymorphism via overridden toString()
- Tested in Demo.java

Problem 4 – Interfaces and Scalability
--------------------------------------
Demonstrates how interfaces can be used to achieve flexibility similar to multiple inheritance.

Classes/Interfaces:
- Shape hierarchy from Problem 3
- Scalable (interface with scale(double factor) method)

Key Concepts:
- Interface implementation and inheritance
- Scaling object properties using the scale() method
- Static methods operating on arrays of Scalable objects
- Output comparison before and after scaling
- Tested in Demo.java

## Folder Structure

```
JAVA-QAP3-SEM3/
│
├── Problem1/
│   ├── Person.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── CollegeStudent.java
│   ├── Demo.java
│
├── Problem2/
│   ├── Point.java
│   ├── MovablePoint.java
│   ├── Demo.java
│
├── Problem3/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Ellipse.java
│   ├── Triangle.java
│   ├── EquilateralTriangle.java
│   ├── Demo.java
│
├── Problem4/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Ellipse.java
│   ├── Triangle.java
│   ├── EquilateralTriangle.java
│   ├── Scalable.java
│   ├── Demo.java
│
```

