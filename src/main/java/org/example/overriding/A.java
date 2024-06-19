package org.example.overriding;

public class A {
  void m1(){

  }
  void m2(){

  }
}

class B extends A{
    @Override
    void m1() {
        System.out.println("Hello");
    }
}

class Client{

    public static void main(String[] args) {
         A a = new B();
         a.m1();
    }
}
