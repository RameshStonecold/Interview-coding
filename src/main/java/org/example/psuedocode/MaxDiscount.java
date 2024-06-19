package org.example.psuedocode;

import java.util.Scanner;

public class MaxDiscount {
    public static void main(String[] args) {

        int N =5;
        int arr[] = {4,5,6,7,9};

        int res = maxDiscount(arr,N);


        System.out.println("Final output : "+res);
    }

    private static int maxDiscount(int arr[], int N){
        int res =0;

        boolean isMaxD =false;
        int k=1;

        while(isMaxD){
            for(int i= arr.length-k; i>=0; i--){
                res +=arr[i];
            }
            if(isMaxD){
                return res;
            }else{
                res =0;
                k++;

                //res%2==0
                return res;
            }
        }

        return res;

    }


}
