package org.example.interviewCoding;

import java.util.stream.Stream;

public class FindMissingNumberIntegerArray {


    // Function to find the missing elements
    static String printMissingElements(int[] arr, int N)
    {

        // Initialize diff
        int diff = arr[0];
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < N; i++)
        {

            // Check if diff and arr[i]-i
            // both are equal or not
            if (arr[i] - i != diff)
            {
                // Loop for consecutive
                // missing elements
                while (diff < arr[i] - i)
                {
                  //  System.out.print((i + diff) + " ");

                    str.append(i + diff+ " ");
                    diff++;
                }
            }
        }
        return str.toString();
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Given array arr[]
        int[] arr = { 6, 7, 10, 11, 13 };

        int N = arr.length;

        // Function call
        System.out.println("First method :: "+ printMissingElements(arr, N) );

        System.out.println();
        //find missing num
      System.out.println("second method :: "+ searchFindMissingNum(arr,N) );
    }


    static int searchFindMissingNum(int[] ar, int size)
    {
        // Extreme cases
        if (ar[0] != 1)
            return 1;
        if (ar[size - 1] != (size + 1))
            return size + 1;

        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1) {
            mid = (a + b) / 2;
            if ((ar[a] - a) != (ar[mid] - mid))
                b = mid;
            else if ((ar[b] - b) != (ar[mid] - mid))
                a = mid;
        }
        return (ar[a] + 1);
    }

}
