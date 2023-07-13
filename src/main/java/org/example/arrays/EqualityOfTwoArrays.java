package org.example.arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {

        int [] a = {10,20,30,40};
        int [] b = {10,20,31,40,44};

        boolean check = false;
        if(a.length==b.length){

            for (int i=0; i<a.length; i++){
                if(a[i]==b[i]){
                    check=true;

                }else {
                    check=false;
                    break;
                }
            }
        }else {
            check=false;
        }

        if(check) {
            System.out.println("Two arrays are equal");
        }else {
            System.out.println("Two arrays are not equal");
        }
    }
}
