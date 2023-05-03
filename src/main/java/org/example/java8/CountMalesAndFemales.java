package org.example.java8;

import org.example.java8.model.Employee;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountMalesAndFemales {


    public static void main(String[] args) {
        EmployeeList emp  = new EmployeeList();
        List<Employee> employees =emp.getEmpList();

       // employees.stream().map(Collectors.groupingBy());


    }
}
