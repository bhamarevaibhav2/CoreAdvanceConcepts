package com.mgshome.multithreading;

public class MythreadWithThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("MyThreadWithThread is Running");

    }
}
