package org.example.java8;

@FunctionalInterface
 interface A {
    void call();
    default void control(){
        System.out.println("COntrol A");
    }
}

@FunctionalInterface
interface B {
    void call();
    default void control(){
        System.out.println("COntrol B");
    }
}

class C implements A,B{

    @Override
    public void call() {

        System.out.println("Working");
    }

    @Override
    public void control() {
        A.super.control();
        B.super.control();
    }
}

public class Client{
    public static void main(String[] args) {

         C ref = new C();
         ref.call();
         ref.control();
    }
}