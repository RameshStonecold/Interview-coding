package org.example.multithreading;

public class DeadlockDemo {
    private static final String str1 = "Know Program";
    private static final String str2 = "Learn Java";

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

    private static class MyThread1 extends Thread {
        public void run() {
            synchronized(str1) {
                System.out.println("str1 resource locked by Thread-0");
                try {Thread.sleep(1000);} catch (Exception e) {}
                System.out.println("Thread-0 trying to get lock of str2");
                synchronized(str2) {
                    System.out.println("str2 resource locked by Thread-0");
                }
            }
        }
    }

    private static class MyThread2 extends Thread {
        public void run() {
            synchronized(str2) {
                System.out.println("str2 resource locked by Thread-1");
                try {Thread.sleep(1000);} catch (Exception e) {}
                System.out.println("Thread-1 trying to get lock of str1");
                synchronized(str1) {
                    System.out.println("str1 resource locked by Thread-0");
                }
            }
        }
    }

}
