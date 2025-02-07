# School Manager System

## Overview
This Java project implements a simple school management system with multiple classes representing employees, faculty, and department chairs. The program demonstrates object-oriented principles such as inheritance and method overriding.

## Features
- **SchoolEmployee Class**
  - Stores basic employee information (name, office number, organization).
  - Provides a `Work()` method to describe an employee’s role.
- **Faculty Class** (inherits from `SchoolEmployee`)
  - Adds office hours attribute.
  - Overrides `Work()` method to include office hour details.
- **DepartmentChair Class** (inherits from `Faculty`)
  - Adds department attribute.
  - Overrides `Work()` method to include department information.
- **School_Manager Class**
  - Creates instances of `SchoolEmployee`, `Faculty`, and `DepartmentChair`.
  - Demonstrates setting attributes and calling `Work()` method.

## File Structure
- `SchoolEmployee.java`: Base class for school employees.
- `Faculty.java`: Inherits from `SchoolEmployee` and adds office hour details.
- `DepartmentChair.java`: Inherits from `Faculty` and adds department details.
- `School_Manager.java`: Main driver program to demonstrate functionality.
- `README.md`: Documentation for the project.

## Compilation and Execution
### Prerequisites
- Java Development Kit (JDK) installed.

### Steps to Compile and Run
1. Open a terminal and navigate to the project directory.
2. Compile the Java files:
   ```bash
   javac SchoolEmployee.java Faculty.java DepartmentChair.java School_Manager.java
   ```
3. Run the program:
   ```bash
   java School_Manager
   ```

## Example Output
```
Ruben Ramirez works for UHCL.
Ruben Ramirez works for UHCL at 5 p.m. to 7 p.m.
Ruben Ramirez works for UHCL at 5 p.m. to 7 p.m.
They chair the department of Math.
```

## Author
Ruben Ramirez

## License
This project is open-source and available for use under the MIT License.
