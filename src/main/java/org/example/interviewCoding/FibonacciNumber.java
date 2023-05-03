package org.example.interviewCoding;

public class FibonacciNumber {

    public static void main(String[] args) {

        int count = 10;
        String fibNum = fibonacciNum(count);
        System.out.println("Fibonacci Num :: "+ fibNum);
        System.out.println("----------------------- ");
        String fibRecursive = fibonacciWithRecursive(count);
        System.out.println("Fibonacci Recursive Num :: "+ fibRecursive);

    }



    public static String fibonacciNum(int count){
        int a = 0;
        int b = 1;
        int c = 1;

        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= count; i++) {

            str.append(a).append(", ");

            a = b;
            b = c;
            c = a + b;
        }
        return str.toString();
    }


    public static String fibonacciWithRecursive(int count){

        StringBuilder str = new StringBuilder();

        for (int i =0; i<count;i++){
            str.append(recursive(count)).append(", ");
        }
      return str.toString();
    }
    public static int recursive(int count){
        if (count <= 1)
            return count;
        return recursive(count - 1) + recursive(count - 2);
    }

}
