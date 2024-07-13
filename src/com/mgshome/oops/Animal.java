package com.mgshome.oops;

//interface- is like contract or blueprint or we can say map of building
public interface Animal extends Car,Men{

    public static final int id = 101;  //by default all variables are public static final in interface
    public static final String name="Vaibhav";

    void eat(); //by default all methods are abstract excluding static and default

    //default method java 8
    public default void give(){
        System.out.println("default method");
    }

    public static void Given(){
        System.out.println("Given method");
    }


}
