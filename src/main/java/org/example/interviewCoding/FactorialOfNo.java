package org.example.interviewCoding;

public class FactorialOfNo {

    public static void main(String[] args) {
        int n= 4;
        usingRecursive(n);

        System.out.println("------------------");
        usingWhileLoop(n);
        System.out.println("------------------");
        System.out.println("------------------");
        usingAnotherWayWhileLoop(n);
    }




    public static void usingRecursive(int n){


        int result = factorial(n);
        System.out.println("Step1 : int result = factorial(n); "+ result);

        System.out.println("Using recursive function :"+result);

    }

    private static int factorial(int n){
        if(n!=0){
            System.out.println("Step2 :  return n* factorial(n-1); "+ n);
        return n* factorial(n-1);
        }
        return 1;

    }



    private static void usingWhileLoop(int num){
       int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            System.out.println(factorial);
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

    }

    private static void usingAnotherWayWhileLoop(int num){
        int count =1;
        int factorial =1;
        while (count<=num){

            factorial*= count;
            System.out.println(factorial);
            count++;
        }
        System.out.println(factorial);
    }

}
