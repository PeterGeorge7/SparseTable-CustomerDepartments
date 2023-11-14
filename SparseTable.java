
// Importing necessary classes
import classes.CellData;
import classes.DepartmentList;
import classes.EmployeeList;
import classes.DepartmentList.Department;
import classes.EmployeeList.Employee;

// Class representing a sparse table that relates employees to departments
class SparseTable {
    // Method to add an employee to a department
    public void addEmployeeToDepartment(Employee employee, Department department) {
        // Extracting employee and department IDs
        int employeeId = employee.getEmployeeId();
        int departmentId = department.getDepartmentId();

        // Creating a new cell data with the extracted IDs
        CellData newCellData = new CellData(employeeId, departmentId);

        // Handling the case where the department's first employee cell data is null
        if (department.getFirstEmployeeCellData() == null) {
            department.setFirstEmployeeCellData(newCellData);
        } else {
            // Traverse to the end of the department's cell data and link the new cell data
            CellData current = department.getFirstEmployeeCellData();
            while (current.getNextCellRight() != null) {
                current = current.getNextCellRight();
            }
            current.setNextCellRight(newCellData);
        }

        // Handling the case where the employee's first department cell data is null
        if (employee.getFirstdDepartmentCellData() == null) {
            employee.setFirstdDepartmentCellData(newCellData);
        } else {
            // Traverse to the end of the employee's cell data and link the new cell data
            CellData current = employee.getFirstdDepartmentCellData();
            while (current.getNextCellDown() != null) {
                current = current.getNextCellDown();
            }
            current.setNextCellDown(newCellData);
        }
    }

    // Method to display the departments associated with an employee
    public void displayEmployeeDepartments(Employee employee) {
        // Checking if the employee has any associated departments
        if (employee.getFirstdDepartmentCellData() == null) {
            System.out.println("No departments for employee " + employee.getEmployeeId());
        } else {
            // Traverse the employee's cell data and print associated department IDs
            CellData curCellData = employee.getFirstdDepartmentCellData();
            System.out.println(employee.getEmployeeName() + " is associated with the following departments:");
            while (curCellData != null) {
                System.out.println(curCellData.getDepartmentId());
                curCellData = curCellData.getNextCellDown();
            }
        }
    }

    // Method to display the employees in a department
    public void displayDepartmentEmployees(Department department) {
        // Checking if the department has any associated employees
        if (department.getFirstEmployeeCellData() == null) {
            System.out.println("No employees in department " + department.getDepartmentId());
        } else {
            // Traverse the department's cell data and print associated employee IDs
            CellData curCellData = department.getFirstEmployeeCellData();
            System.out.println("Employees in department " + department.getDepartmentId() + ":");
            while (curCellData != null) {
                int employeeId = curCellData.getEmployeeId();
                System.out.println(employeeId); // You can customize this based on your needs
                curCellData = curCellData.getNextCellRight();
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating instances of EmployeeList and DepartmentList
        EmployeeList employeeList = new EmployeeList();
        DepartmentList departmentList = new DepartmentList();

        // Adding employees and departments
        Employee peter = employeeList.addNewEmployee(1, "Peter");
        Employee mark = employeeList.addNewEmployee(2, "Mark");

        Department it = departmentList.addNewDepartment(10, "IT");
        Department network = departmentList.addNewDepartment(20, "Network");
        Department web = departmentList.addNewDepartment(30, "WEB");
        Department cyper = departmentList.addNewDepartment(40, "Cyber");

        // Creating an instance of SparseTable
        SparseTable sparseTable = new SparseTable();

        // Adding employees to departments
        sparseTable.addEmployeeToDepartment(peter, it);
        sparseTable.addEmployeeToDepartment(peter, network);
        sparseTable.addEmployeeToDepartment(peter, web);
        sparseTable.addEmployeeToDepartment(peter, cyper);
        sparseTable.addEmployeeToDepartment(mark, network);

        // Displaying the departments associated with an employee
        sparseTable.displayEmployeeDepartments(peter);

        // Displaying the employees in a department
        sparseTable.displayDepartmentEmployees(network);
    }
}