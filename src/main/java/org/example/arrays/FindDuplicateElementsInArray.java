package org.example.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {

        int[] arr = {1,4,6,8,3,4,2,2,7};
        findDuplicatesWithBruteForce(arr);

        findDuplicatesUsingSortMethod(arr);

        findDuplicatesUsingHashSet(arr);

        findDuplicatesUsingHashMap(arr);

        findDuplicatesUsingJava8(arr);

    }


    public static void findDuplicatesWithBruteForce(int[] arr){

        for (int i=0; i<arr.length; i++){

            for (int j=i+1;j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]);
                }
            }
        }
    }

    //Method 2 : Sorting Method

    public static void findDuplicatesUsingSortMethod(int[] inputArray)
    {
        Arrays.sort(inputArray);

        System.out.println();
        System.out.print("Duplicates element using sort method : ");
        for (int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray[i] == inputArray[i+1])
            {
                System.out.print(inputArray[i]);
            }
        }
        System.out.println();
    }

    //Method 3 : Using HashSet

    private static void findDuplicatesUsingHashSet(int[] inputArray)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : inputArray)
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element using Hashset : "+element);
            }
        }
    }

    //Method 4 : Using HashMap

    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }

    //Method 5 : Using Java 8 Streams

    private static void findDuplicatesUsingJava8(int[] inputArray)
    {
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements with java8 ::"+duplicateElements);
    }




}
