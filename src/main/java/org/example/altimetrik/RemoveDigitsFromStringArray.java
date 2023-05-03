package org.example.altimetrik;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDigitsFromStringArray {

    public static void main(String[] args) {


        //input : ["1","3","4","2", "5", "11"]
        //output : [1,2,3,4,5,11]

        String[] arr = {"1", "3", "4", "2", "5", "11"};

        Stream<String> stringStreams = Stream.of(arr);

        int[] integerList = stringStreams.mapToInt(Integer::valueOf).toArray();

        System.out.println(Arrays.toString(integerList));

        String[] arr2 = {"1", "3", "7ABC", "4", "2", "xyz8", "5","12Ra4","mesh433"};
        //output : [1,2,3,4,5,11]
        //


        Stream<String> stringStream2 = Stream.of(arr2);

        int[] integerList2 = stringStream2.
                filter(x -> Boolean.parseBoolean(x.replaceAll("[\\d]", "")))
                .mapToInt(Integer::valueOf).toArray();

        String str = "123abs";
        String pattern = "[^a-zA-Z0-9]";

        str = str.replaceAll(pattern, " ");

        boolean b = Character.isLetter(str.charAt(0));

        System.out.println(str);
        System.out.println(b);

        System.out.println("Final array :: "+Arrays.toString(integerList2));


        System.out.println("Testing----");
        removeDigitsFromString(arr2);

        System.out.println("------------------------");
        usingJava8RemoveDigits(arr2);
    }


    private static void usingJava8RemoveDigits(String[] strings){

            List<String> stringList =  Arrays.asList(strings);  // Arrays.asList("1", "2", "A", "B", "C1D2E3");



            List<String> collect = stringList.stream()
                    .map(x -> new Scanner(x).findAll("\\D+")
                            .map(m -> m.group())
                            .collect(Collectors.toList())
                    )									 	// List<List<String>>
                    .flatMap(List::stream)					// List<String>
                    .collect(Collectors.toList());


            collect.forEach(x-> System.out.print(x+" "));

        }


    private static void removeDigitsFromString(String[] strArr) {

        Stream.of(strArr).filter(x->x.matches("\\D+")).collect(Collectors.toList()).forEach(System.out::println);


    }
}
