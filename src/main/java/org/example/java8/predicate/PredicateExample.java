package org.example.java8.predicate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    /*
*
Conclusion:
Use Predicate when: a) The condition is reused, complex, or dynamic.
b) You want better readability or composability.

Avoid Predicate when: The condition is simple and used only once.
*
*
* */



    public static void main(String[] args) {
        Predicate<Employee> salaryRangeBetween60KTo90K = emp -> emp.salary>60000 && emp.salary<90000;
        System.out.println("Salary greater than 60000 : "+salaryRangeBetween60KTo90K);
        //logic1 using predicate
        employees.stream().filter(salaryRangeBetween60KTo90K).forEach(System.out::println);
        //logic2 without predicate
        employees.stream().filter(emp -> emp.salary>60000 && emp.salary<90000).forEach(System.out::println);
    }

   private record Employee( int id,  String name, String department, double salary){ }

  private static List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 75000),
            new Employee(2, "Bob", "HR", 50000),
            new Employee(3, "Charlie", "Finance", 60000),
            new Employee(4, "Diana", "IT", 90000),
            new Employee(5, "Eve", "Finance", 120000)
    );






}


