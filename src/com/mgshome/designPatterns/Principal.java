package com.mgshome.designPatterns;

public class Principal {

    private static Principal principal; //by default null

    //1. Constructor private
    private Principal(){

    }

    public static Principal getPrincipal(){

        //if no object in that variable
        if(principal == null){
            principal = new Principal();
        }
        return principal;
    }
}
