package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountGreaterThan4 {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("xhdhed","sd", "", "ramesh", "jkk");


       List<String> removedEmptyStrings = strList.stream()
               .filter(x->((!x.matches(""))&&(x.length()>4)) ).collect(Collectors.toList());

       System.out.println( " Removed empty strings :: " +removedEmptyStrings);
    }
}
