package org.example.interviewCoding;

import java.util.HashMap;

public class FindSumOfTwoDigitsPair {


    public static void main(String[] args) {

        int []arry = new int[]{1,3,5,6,2,7,4};

        for (int i=0; i<arry.length; i++){

            for (int j=1; j<arry.length; j++){

                if (arry[i]+arry[j]==8){
                    System.out.println("Sum :: ("+arry[i]+","+arry[j]+")");
                }

            }
        }

    }


}
