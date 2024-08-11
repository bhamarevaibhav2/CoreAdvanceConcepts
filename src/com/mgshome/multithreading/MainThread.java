package com.mgshome.multithreading;

public class MainThread {

    public static void main(String[] args) {

        //extends Thread
        MythreadWithThread t1 = new MythreadWithThread();
        t1.start();

        //implements runnable
        Mythreadwithrunnable t2 = new Mythreadwithrunnable();
        Thread thread = new Thread(t2);
        thread.start();

        //Anonymous class
        Runnable run = new Runnable(){

            public void run(){
                System.out.println(Thread.currentThread().getName());
                System.out.println("From Anonymous class");
            }
        };

        Thread t3 = new Thread(run);
        t3.start();

        //lambda Expression
        Runnable runs = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("From lambda Expression");
        };
        Thread t4 = new Thread(runs);
        t4.start();
    }
}
