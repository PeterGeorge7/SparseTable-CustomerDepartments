package classes;

public class CellData {
    int departmentId; // Department ID
    int employeeId; // Employee ID
    CellData nextCellRight; // Reference to the next cell in the right direction
    CellData nextCellDown; // Reference to the next cell in the down direction

    // Constructor to initialize cell data
    public CellData(int employeeId, int departmentId) {
        this.departmentId = departmentId;
        this.employeeId = employeeId;
    }

    // Getter method for the next cell in the right direction
    public CellData getNextCellRight() {
        return this.nextCellRight;
    }

    // Getter method for the next cell in the down direction
    public CellData getNextCellDown() {
        return this.nextCellDown;
    }

    // Setter method for the next cell in the down direction
    public void setNextCellDown(CellData nextCellDown) {
        this.nextCellDown = nextCellDown;
    }

    // Setter method for the next cell in the right direction
    public void setNextCellRight(CellData nextCellRight) {
        this.nextCellRight = nextCellRight;
    }

    // Getter method for the department ID
    public int getDepartmentId() {
        return this.departmentId;
    }

    // Getter method for the employee ID
    public int getEmployeeId() {
        return this.employeeId;
    }
}