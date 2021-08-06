package entities;

public class Employee {
    String employeName;
    String employeeId;
    String phoneNumber;

    public Employee(String emp, String id, String num){
        this.employeeId = id;
        this.employeName = emp;
        this.phoneNumber = num;
    }
}
