# Sparse Table Implementation

This Java project implements a sparse table designed for the head row as employees and the column head as departments. The sparse table allows you to add employees to departments and display information about the association between employees and departments.

## Classes

### DepartmentList

#### Department class:

- `private int departmentId`: Department ID.
- `private String departmentName`: Department name.
- `private Department nextDepartment`: Reference to the next department.
- `private CellData firstEmployeeCellData`: Reference to the first cell data containing employee information.

Methods:

- `public CellData getFirstEmployeeCellData()`: Get the first cell data of the department.
- `public void setFirstEmployeeCellData(CellData newCellData)`: Set the first cell data of the department.
- `public int getDepartmentId()`: Get the department ID.
- `public String getDepartmentName()`: Get the department name.

#### DepartmentList class:

- `private Department firstDepartment`: Reference to the first department.

Methods:

- `public Department addNewDepartment(int departmentId, String departmentName)`: Add a new department to the list.

### EmployeeList

#### Employee class:

- `int employeeId`: Employee ID.
- `String employeeName`: Employee name.
- `Employee nextEmployee`: Reference to the next employee.
- `CellData firstdDepartmentCellData`: Reference to the first cell data containing department information.

Methods:

- `public int getEmployeeId()`: Get the employee ID.
- `public CellData getFirstdDepartmentCellData()`: Get the first cell data of the employee.
- `public void setFirstdDepartmentCellData(CellData firstdDepartmentCellData)`: Set the first cell data of the employee.
- `public String getEmployeeName()`: Get the employee name.

#### EmployeeList class:

- `Employee firstEmployee`: Reference to the first employee.

Methods:

- `public Employee addNewEmployee(int employeeId, String employeeName)`: Add a new employee to the list.
- `public void setFirstDepartmentCellData(Employee employee, CellData newCellData)`: Set the first cell data of the employee.
- `public Employee getFirstDepartment()`: Get the first employee.
- `public CellData getFirstDepartmentCellData(Employee employee)`: Get the first cell data of the employee.
- `public int getEmployeeId(Employee employee)`: Get the employee ID.

### CellData

- `int departmentId`: Department ID.
- `int employeeId`: Employee ID.
- `CellData nextCellRight`: Reference to the next cell in the right direction.
- `CellData nextCellDown`: Reference to the next cell in the down direction.

Methods:

- `public CellData getNextCellRight()`: Get the next cell in the right direction.
- `public CellData getNextCellDown()`: Get the next cell in the down direction.
- `public void setNextCellDown(CellData nextCellDown)`: Set the next cell in the down direction.
- `public void setNextCellRight(CellData nextCellRight)`: Set the next cell in the right direction.
- `public int getDepartmentId()`: Get the department ID.
- `public int getEmployeeId()`: Get the employee ID.

### SparseTable

This class contains the main functionality of adding employees to departments and displaying information about employees and departments.

Methods:

- `public void addEmployeeToDepartment(Employee employee, Department department)`: Add an employee to a department.
- `public void displayEmployeeDepartments(Employee employee)`: Display the departments associated with an employee.
- `public void displayDepartmentEmployees(Department department)`: Display the employees in a department.

## Main Method

The main method contains an example scenario where employees are added to departments, and then the associations are displayed.

## Usage

1. Create instances of `EmployeeList`, `DepartmentList`, and `SparseTable`.
2. Add employees and departments using the respective methods.
3. Use the `addEmployeeToDepartment`, `displayEmployeeDepartments`, and `displayDepartmentEmployees` methods in the `SparseTable` class to interact with the sparse table.
4. Feel free to customize the code to suit your specific requirements.
