package org.example.java8.model;

import java.util.List;

public class Employee {

    public Employee(){
    }
    String empId;
    String empName;
    String emailId;
    Double salary;
    List<Profile> empProfileList;
    Department department;
    GENDER gender;

    public Employee(String empId, String empName, String emailId, Double salary, List<Profile> empProfileList, Department department, GENDER gender) {
        this.empId = empId;
        this.empName = empName;
        this.emailId = emailId;
        this.salary = salary;
        this.empProfileList = empProfileList;
        this.department = department;
        this.gender = gender;
    }

    public Employee(String s, String sita, String s1, double v, List<Profile> profileList2, Department emp2Dept) {
    }
}
