package org.example.java8;

import org.example.java8.model.Department;
import org.example.java8.model.EMP_ROLE;
import org.example.java8.model.Employee;
import org.example.java8.model.Profile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {



    public List<Employee> getEmpList() {


        List<Profile> profileList1 = new ArrayList<>();
        Profile profile1 = new Profile("11","7979989","Sita@123");
        Profile profile2 = new Profile("22","8973432","Sita@123");
        profileList1.add(profile1);
        profileList1.add(profile2);

        List<Profile> profileList2 = new ArrayList<>();
        Profile profile3 = new Profile("33","788999","Rama@123");
        Profile profile4 = new Profile("11","788922","Rama@123");
        profileList2.add(profile3);
        profileList2.add(profile4);

        Department emp1Dept = new Department("111","Java", EMP_ROLE.DEVELOPER,"Hyderabad");
        Department emp2Dept = new Department("222","Java", EMP_ROLE.DEVELOPER,"Hyderabad");

        Employee emp1 = new Employee("1","Rama","rama@gmail.com",10000.00,profileList1,emp1Dept);
        Employee emp2 = new Employee("2","Sita","sita@gmail.com",10000.00,profileList2,emp2Dept);


        List<Employee> employeeList = new ArrayList<>();
         employeeList.add(emp1);
        return employeeList;


    }



}
