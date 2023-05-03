package org.example.interviewCoding;

public class InfiniteLo0p {

    public static void main(String[] args) {
        InfiniteLo0p i = new InfiniteLo0p();
        i.m1();  //enter to infinite loop
    }

    private void m2(){
        m1();
        System.out.println("Executing m2");
    }
    private void m1(){
        m2();
        System.out.println("Executing m1");
    }

}
