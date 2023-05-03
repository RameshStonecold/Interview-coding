package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertListofStringstoIntegerArray {

    /*  input =
    *
    * */

    public static int[] getIntegerSorted(String[] str){



       List<String> al = Stream.of(str).
               map(x-> new Scanner(x).findAll("\\d+").
                       map(m->m.group()).collect(Collectors.toList())).
               flatMap(List::stream).collect(Collectors.toList());

        return al.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        String[] str = {"1","2ac","765yb","fbg23"};
       int []arr =getIntegerSorted(str);

       System.out.println(Arrays.toString(arr));
    }


}
