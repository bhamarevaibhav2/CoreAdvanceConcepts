package com.mgshome.exceptionhanding;

class ThrowsExecp {

    //using the throws keyword we handled the InterruptedException and we will get the output as Hello Geeks
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
