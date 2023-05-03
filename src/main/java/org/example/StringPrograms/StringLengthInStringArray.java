package org.example.StringPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLengthInStringArray {

    public static void main(String[] args) {


        String[] list = {"Data Structures", "JAVA", "OOPS",
                "GeeksforGeeks", "Algorithms"};

        List<String> stringList =Stream.of(list).filter(x->x.length()>4).collect(Collectors.toList());

        System.out.println(stringList);


    }
}
