# Java Assignment: Basic Payroll System

## **Objective**
Design and implement a basic payroll system in Java using Object-Oriented Programming (OOP) principles such as encapsulation, constructors, and methods.

---

## **Assignment Overview**
Students will create a simple payroll system that calculates the weekly salary of employees. The system should include employee details such as name, employee ID, department, hourly wage, and total hours worked. The program will calculate the weekly salary based on these details and display the information using a `toString()` method.

---

## **Instructions**
### **1. Create an `Employee` class**
- The class should encapsulate the following private fields:
  - `String name`
  - `int employeeId`
  - `String department`
  - `double hourlyWage`
  - `double hoursWorked`

### **2. Provide public getter and setter methods**
- Create public getter and setter methods for each field to ensure encapsulation.

### **3. Add a Constructor**
- Create a constructor that takes the following parameters: `name`, `employeeId`, `department`, `hourlyWage`, and `hoursWorked`, and initializes the respective fields.

### **4. Create a `calculateWeeklySalary()` method**
- This method should return the employee’s weekly salary using the formula:
  
  **`weekly salary = hourlyWage * hoursWorked`**
  
- Assume employees can work a maximum of 40 hours per week. If hours exceed 40, overtime pay is 1.5 times the hourly wage for any overtime hours (i.e., hours above 40).

### **5. Override the `toString()` method**
- The `toString()` method should return a formatted string representation of the employee’s details in the following format:
  
  **`Employee{name='John Doe', employeeId=101, department='Engineering', hourlyWage=25.0, hoursWorked=45.0, weeklySalary=1187.5}`**

### **6. Create a `PayrollSystem` class with a `main` method**
- This class should create multiple `Employee` objects with different data.
- Display the details of each employee by calling their `toString()` method.
- Calculate and display the weekly salary for each employee.

---

## **Expected Output**
```text
Employee{name='John Doe', employeeId=101, department='Engineering', hourlyWage=25.0, hoursWorked=45.0, weeklySalary=1187.5}
Employee{name='Jane Smith', employeeId=102, department='Marketing', hourlyWage=30.0, hoursWorked=40.0, weeklySalary=1200.0}
Employee{name='Bob Johnson', employeeId=103, department='HR', hourlyWage=20.0, hoursWorked=50.0, weeklySalary=1100.0}
```

---

## **Grading Criteria**
| Criteria | Description |
|----------|-------------|
| **Encapsulation** | All fields are private with appropriate getters and setters. |
| **Constructor Implementation** | Correctly initializes class fields with parameters. |
| **Correct Weekly Salary Calculation** | Includes overtime pay calculation for hours exceeding 40. |
| **Overriding `toString()` Method** | Returns a properly formatted string representation of the employee. |
| **Proper Output Format** | The output matches the expected structure. |

---

## **Submission Guidelines**
1. Ensure your code follows Java naming conventions and best practices.
2. Submit your Java source files (`Employee.java` and `PayrollSystem.java`) as a `.zip` file or upload to a GitHub repository.
3. Include comments in your code explaining each part.
4. Your program should compile and run without errors.

---

## **Bonus Challenge (Optional)**
- Extend the program to allow user input for employee details.
- Add a `Manager` subclass that extends `Employee` with an additional `bonus` attribute.
- Store multiple employees in an array or list and allow sorting by salary.
