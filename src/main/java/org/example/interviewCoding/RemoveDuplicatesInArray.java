package org.example.interviewCoding;

import java.util.*;

import java.util.stream.IntStream;


public class RemoveDuplicatesInArray {

    public static void main(String[] args) {


        int[] arr = { 5, 2, 6, 8, 6, 7, 5, 2, 8, 3 };

        usingJava8(arr);
        removeDuplicatesInIntegerArrayUsingSortMethod(arr);

       usingHashMap(arr);
        usingLinkedHashSet(arr);
       // removeDuplicatesInIntegerArray(arr);

       // removeDuplicatesInIntegerArrayUsingSortMethod(arr);
    }

    private static void usingJava8(int[]arr){

        Integer[] newArray = IntStream.of(arr).boxed().distinct().sorted().toArray(Integer[]::new);

        System.out.println("using java8 IntStream boxed :: "+ Arrays.toString(newArray));
    }


    private static void usingHashMap(int[] arr){

        int n = arr.length;
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i=0; i<n; i++){

            if(map.get(arr[i])==null){
                System.out.print(arr[i] + " ");
                map.put(arr[i],true);
            }
        }
     System.out.println(map);
    }

    private static void usingLinkedHashSet(int[] arr){

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println("Using Linked Hashset :: "+set);
    }

    private static void removeDuplicatesInIntegerArrayUsingSortMethod(int[] arr){

        int n = arr.length;

        Arrays.sort(arr);
       int j=0;

        for (int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }

        }
        arr[j++] =arr[n-1];
        for (int i=0; i<j;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


