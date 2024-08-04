package com.mgshome.designPatterns;

public class PrincipalMain {
    public static void main(String[] args) {

        //new Principal(); we can not create object of class principle because constructor is private

        Principal principal = Principal.getPrincipal(); //we can call method using class name because method is static
        System.out.println(principal.hashCode());
        //same object will be return because method will call all time but in method there is condition
        Principal principal2 = Principal.getPrincipal();
        System.out.println(principal2.hashCode());
    }
}
