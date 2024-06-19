package org.example.overriding;

public class ThowsExceptionTest {

    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e){

        }

    }

    public static void methodA() throws Exception{
        methodB();
    }
    public static void methodB() throws IndexOutOfBoundsException{

    }
}
