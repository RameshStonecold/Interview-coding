package org.example.interviewCoding;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =5;
        isPrimeNumber(num);

    }




    private static boolean isPrimeNumber(int num){
        boolean flag = false;

            for (int i = 2; i <=num / 2; i++) {

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

        if(!flag){
            System.out.println("Number is prime no :"+num);
        }else {
            System.out.println("Number is not prime no :"+num);
        }
        return flag;
    }

}
