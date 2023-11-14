package classes;

public class EmployeeList {
    // Linked list of employees
    Employee firstEmployee;

    // Employee class representing each employee node
    public class Employee {
        int employeeId; // ID of the employee
        String employeeName; // Name of the employee
        Employee nextEmployee; // Reference to the next employee in the list
        CellData firstdDepartmentCellData; // Reference to the first cell data containing department information

        // Constructor to initialize employee
        public Employee(int employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        // Getter method for the employee ID
        public int getEmployeeId() {
            return this.employeeId;
        }

        // Getter method for the first cell data of the employee
        public CellData getFirstdDepartmentCellData() {
            return this.firstdDepartmentCellData;
        }

        // Setter method for the first cell data of the employee
        public void setFirstdDepartmentCellData(CellData firstdDepartmentCellData) {
            this.firstdDepartmentCellData = firstdDepartmentCellData;
        }

        // Getter method for the employee name
        public String getEmployeeName() {
            return this.employeeName;
        }
    }

    // Method to add a new employee to the list
    public Employee addNewEmployee(int employeeId, String employeeName) {
        Employee newEmployee = new Employee(employeeId, employeeName);
        if (firstEmployee == null) {
            // If the list is empty, set the new employee as the first employee
            firstEmployee = newEmployee;
            firstEmployee.nextEmployee = null;
        } else {
            // Traverse the list to find the last employee and link the new employee
            Employee currentEmployee = firstEmployee;
            while (currentEmployee.nextEmployee != null) {
                currentEmployee = currentEmployee.nextEmployee;
            }
            currentEmployee.nextEmployee = newEmployee;
        }
        return newEmployee;
    }
}