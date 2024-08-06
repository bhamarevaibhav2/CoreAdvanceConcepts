package com.mgshome.designPatterns.Factory;

//factory design pattern
public class AndroidDeveloper implements Developers {

    public int salary(){
        System.out.print("Getting AndroidDeveloper's salary : ");
        return 60000;
    }
}
