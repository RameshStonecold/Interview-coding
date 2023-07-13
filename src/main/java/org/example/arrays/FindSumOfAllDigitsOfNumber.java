package org.example.arrays;

public class FindSumOfAllDigitsOfNumber {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,3,4,2,2,7};

        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum +=arr[i];
        }

        System.out.println("Sum of all digits ::"+ sum);
    }
}
