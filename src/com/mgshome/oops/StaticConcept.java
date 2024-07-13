package com.mgshome.oops;

public class StaticConcept {

    //static variable
    public static int collageId = 12131;
    static int a;

    // multiple static blocks in one class
    static{
        System.out.println("Static block1");
        a = 4*4;
    }
    static{
        System.out.println("Static block2");
        a = a*4;
    }

    //static method you can overload but not override
    public static void stname(String name){
        System.out.println("Student name: "+name);
    }

    public static void stname(int id){
        System.out.println("Student id: "+id);
    }

    //static class we can declare only nested class as static
    public static class innerClass{

        public void run(){
            System.out.println("Static class method...");
        }
    }


}
