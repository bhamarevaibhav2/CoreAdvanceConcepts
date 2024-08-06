package com.mgshome.designPatterns.Factory;

//factory design pattern
public class WebDeveloper implements Developers {

    public int salary(){
        System.out.print("Getting Web Developer Salary : ");
        return 50000;
    }
}
