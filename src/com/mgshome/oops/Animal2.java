package com.mgshome.oops;

public abstract class Animal2 {

    //local or instance variable
   public int age;
    //static final variable
   public static final String name="Animal";

    //abstract method accepted
   public abstract void sleep();

   //concrete method accepted
   public void main(){
       System.out.println("i am an animal main");
   }

   //static methods accepted in abstract class
   public static void run(){
       System.out.println("Animal running");
   }
}
