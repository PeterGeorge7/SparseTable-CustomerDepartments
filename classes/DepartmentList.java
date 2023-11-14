package classes;

public class DepartmentList {
    // Linked list of departments
    private Department firstDepartment;

    // Department class representing each department node
    public class Department {
        private int departmentId; // ID of the department
        private String departmentName; // Name of the department
        private Department nextDepartment; // Reference to the next department in the list
        private CellData firstEmployeeCellData; // Reference to the first cell data containing employee information

        // Constructor to initialize department
        public Department(int departmentId, String departmentName) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }

        // Getter method for the first cell data of the department
        public CellData getFirstEmployeeCellData() {
            return this.firstEmployeeCellData;
        }

        // Setter method for the first cell data of the department
        public void setFirstEmployeeCellData(CellData newCellData) {
            this.firstEmployeeCellData = newCellData;
        }

        // Getter method for the department ID
        public int getDepartmentId() {
            return this.departmentId;
        }

        // Getter method for the department name
        public String getDepartmentName() {
            return this.departmentName;
        }
    }

    // Method to add a new department to the list
    public Department addNewDepartment(int departmentId, String departmentName) {
        Department newDepartment = new Department(departmentId, departmentName);
        if (firstDepartment == null) {
            // If the list is empty, set the new department as the first department
            firstDepartment = newDepartment;
            firstDepartment.nextDepartment = null;
        } else {
            // Traverse the list to find the last department and link the new department
            Department currentDepartment = firstDepartment;
            while (currentDepartment.nextDepartment != null) {
                currentDepartment = currentDepartment.nextDepartment;
            }
            currentDepartment.nextDepartment = newDepartment;
        }
        return newDepartment;
    }
}