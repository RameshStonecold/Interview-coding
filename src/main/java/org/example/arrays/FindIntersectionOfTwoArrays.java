package org.example.arrays;

import java.util.*;
import java.util.stream.Stream;


public class FindIntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1={1,5,2,4,6,8,9};
        int[] arr2={0,3,2,4,6,7,10};
        findIntersectionOfTwoArrays(arr1,arr2);

        findIntersectionUsingLinkedList(arr1,arr2);
    }


    public static void findIntersectionOfTwoArrays(int[] arr1, int[] arr2){


       Integer[] arr=     Stream.of(arr1)
                .filter(x-> Arrays.equals(arr2, x))
                .toArray(Integer[]::new);


       System.out.println("Intersection of both array elements :: "+ Arrays.toString(arr));
    }


    public static void findIntersectionUsingLinkedList(int[] arr1, int[] arr2){


        Integer[] arr=  Stream.of(arr1)
                .filter(new LinkedList<>(Arrays.asList(arr2))::remove)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }

}


