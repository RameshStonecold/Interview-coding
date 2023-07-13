package org.example.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestNumberInIntegerArray {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,3,4,2,2,7,9,10,9};

        findSecondLargestUsingSortMethod(arr);

        findSecondLargestUsingBruteForce(arr);

        findSecondLargestNoWithoutPredefindMethod(arr);

        findSecondLargestNoUsingJava8(arr);
    }


    public static void findSecondLargestUsingSortMethod(int []arr){

        int i, first, second;
        int arr_size = arr.length;

        // There should be
        // atleast two elements
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
        // Sort the array
        Arrays.sort(arr);
        // Start from second last element
        // as the largest element is at last
        for (i = arr_size - 2; i >= 0; i--)
        {
            // If the element is not
            // equal to largest element
            if (arr[i] != arr[arr_size - 1])
            {
                System.out.println("The second largest element using sort method is "+ arr[i] +" ");
                System.out.println(" Time Complexity: O(n log n) ");
                System.out.println(" Auxiliary space: O(1) ");
                return;
            }
        }

        System.out.println("There is no second largest element");
    }


    public static void findSecondLargestUsingBruteForce(int[] arr){

            // Sorting the array element in ascending order
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            // 2nd last element will be the second largest number
            System.out.println("Second largest num using bruteforce method :: "+arr[arr.length - 2]);
            System.out.println(" Time Complexity: O(n2) ");
    }


    // Method to find second largest number
    public static void findSecondLargestNoWithoutPredefindMethod(int[] arr) {

        // Array length
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array length should be at least 2");
        }
        // Initialize max and secondMax
        int max = arr[0];
        int secondMax = arr[1];

        // Swap the number if max < secondMax
        if (max < secondMax) {
            int temp = max;
            max = secondMax;
            secondMax = temp;
        }

        // Iterate the array from index 2 to array length
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest element without any method :: " + secondMax);
    }



    public static void findSecondLargestNoUsingJava8(int[] arr){

        int secondLargestNumber = Arrays
                .stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest no using java8 :: "+secondLargestNumber);
    }


}
