package com.mgshome.designPatterns;

//Singleton design pattern
public class Principal {

    private static Principal principal; //by default null

    //1. Constructor private
    private Principal(){

    }

    //lazy way of object initialization
    //good to use but not thread safe
//    public static Principal getPrincipal(){
//
//        //if no object in that variable
//        if(principal == null){
//            principal = new Principal();
//        }
//        return principal;
//    }

    //lazy way of object initialization
    //good to use and thread safe but this is method synchronization
    //disadvantage: if use method synchronization the synchronized full method
//    public synchronized static Principal getPrincipal(){
//
//        //if no object in that variable
//        if(principal == null){
//            principal = new Principal();
//        }
//        return principal;
//    }

    //lazy way of object initialization
    //good to use because thread safe(synchronized block)
    public static Principal getPrincipal(){
        //if no object in that variable
        if(principal == null){
            // synchronized block only for object creation
            synchronized (Principal.class){
                if(principal == null){
                    principal = new Principal();
                }
            }
        }
        return principal;
    }
}
