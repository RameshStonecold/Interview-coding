package org.example.interviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSmallestAndLargetNumberInArray {

    public static void main(String[] args) {
        //array of 10 numbers
        int arr[] = new int[]{12,56,76,89,100,343,21,234};

//assign first element of an array to largest and smallest
        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);

        System.out.println("-----------------");
        practicesAgain(arr);
        System.out.println("-----------");
        printSecondLargestNum(arr);

        System.out.println("----------------------");
        nthLargestNumberInArray(arr);

        System.out.println("----------------------");

    }


    private static void practicesAgain(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                max= arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("Practices :: Max num"+max+"Min num : "+min);
    }



    private static void printSecondLargestNum(int arr[]){
        int first = Integer.MIN_VALUE;
        int  second =  Integer.MIN_VALUE;


        for (int i=0; i<arr.length; i++){

            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("No second largest found"+second);
        }else {
            System.out.println("The second largest is "+second);
        }

    }


    public static void nthLargestNumberInArray(int arr[]){
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int n =4;
        int num =list.stream().sorted(Comparator.reverseOrder()).limit(n).skip(n-1).findFirst().get();

        var lis =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(lis);
        System.out.println("The third largest number "+num);
    }



}
