package org.example.multithreading;

public class DeadlockUsingRunnable {

        private static final String str1 = "Hello";
        private static final String str2 = "Java";


        public static void main(String[] args) {
            Runnable task1 = () -> {
                synchronized (str1) {
                    System.out.println("str1 resource locked by Thread-1");
                    sleep(1000);
                    System.out.println("Thread-1 trying to get lock of str2");
                    synchronized (str2) {
                        System.out.println("str2 resource locked by Thread-1");
                    }
                }
            };

            Runnable task2 = () -> {
                synchronized (str2) {
                    System.out.println("str2 resource locked by Thread-2");
                    sleep(1000);
                    System.out.println("Thread-2 trying to get lock of str1");
                    synchronized (str1) {
                        System.out.println("str1 resource locked by Thread-2");
                    }
                }
            };

            Thread t1 = new Thread(task1, "Thread-1");
            Thread t2 = new Thread(task2, "Thread-2");

            t1.start();
            t2.start();
        }

        private static void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

