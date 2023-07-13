package org.example.arrays;

import java.util.HashMap;

public class FindAllPairsOfNoWhoseSumIsGivenNo {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,3,4,2,5,2,7,9,10,9,6};
        int givenNo = 10;

        findAllPairsOfGivenNo(arr,givenNo);

        findPairsHashing(arr,givenNo);
    }

    public static void findAllPairsOfGivenNo(int[] arr,int No){

        System.out.print("The sum of all digits to given no "+No+" and pairs are : { ");
        for (int i=0; i<arr.length; i++){

            for (int j=i+1; j<arr.length; j++){

                  if(i+j==No){
                      System.out.print("("+i+","+j+")");
                  }
            }
        }
        System.out.print(" }");
        System.out.println();

    }


    public static void findPairsHashing(int[] arr, int sum)
    {
        System.out.print("The pairs which are equal to "+ sum+" using HashMap are : { ");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(sum - arr[i]) && map.get(sum - arr[i]) == 0)
            {
                System.out.print("("+arr[i] +"," + (sum - arr[i])+")");
                map.replace(sum - arr[i], 1);
            } else {
                map.put(arr[i], 0);
            }
        }
        System.out.println(" }");
        System.out.println();
    }

}
