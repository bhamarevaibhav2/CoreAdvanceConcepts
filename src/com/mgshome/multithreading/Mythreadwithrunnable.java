package com.mgshome.multithreading;

public class Mythreadwithrunnable implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        System.out.println("MyThreadWithRunnable is Running");

    }
}
