package com.mgshome.designPatterns.Singleton;

//Singleton design pattern
public class Ghanta {

    //egger way to object initialization
    //disadvantage: he created at the time of class loading because of static if not use then wasted memory
    private static Ghanta ghanta =  new Ghanta();

    public static Ghanta getGhanta() {
        return ghanta;
    }
}
