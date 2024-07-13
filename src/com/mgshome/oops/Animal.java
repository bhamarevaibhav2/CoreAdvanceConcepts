package com.mgshome.oops;

public interface Animal {

    public static final int id = 101;  //by default all variables are public static final in interface
    public static final String name="Vaibhav";

    void eat(); //by default all methods are abstract excluding static and default


    public default void give(){
        System.out.println("default method");
    }

    public static void Given(){
        System.out.println("Given method");
    }


}
