package org.example.broadcam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpWithSalaryJava8 {


    public void main(String[] args) {

       List<Emp> empList = this.empList();

     // List<String> namesList = empList.stream().filter(x-> x.salary*10/100).filter(x->x.salary>4000.0).
    //           map(x->x.name).collect(Collectors.toList());



    }

    private List<Emp> empList(){

        List<Emp> empList = new ArrayList();
        Emp emp1 = new Emp("1", "ram", 4000.0);
        Emp emp2 = new Emp("2", "raghu", 5000.0);
        Emp emp3 = new Emp("3", "dhasharatha", 6000.0);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        return empList;
    }

     class Emp{
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        private String name;

        private Double salary;
        public Emp(String id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }


    }

}
