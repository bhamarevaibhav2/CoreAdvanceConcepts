package com.mgshome.designPatterns.Singleton;

//Singleton design pattern
public class PrincipalMain {
    public static void main(String[] args) {

        //new Principal(); we can not create object of class principle because constructor is private

        Principal principal = Principal.getPrincipal(); //we can call method using class name because method is static
        System.out.println(principal.hashCode()); //460141958
        //same object will be return because method will call all time but in method there is condition
        Principal principal2 = Principal.getPrincipal();
        System.out.println(principal2.hashCode()); //460141958

        System.out.println(Ghanta.getGhanta().hashCode());
        System.out.println(Ghanta.getGhanta().hashCode());
    }
}
