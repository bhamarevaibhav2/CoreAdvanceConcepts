package com.mgshome.oops;

public class Mainclass {

    public static void main(String[] args) {

        Dog d = new Dog();
        //Static method you can call using interface name
        Animal.Given();

        //default method you can call using child class object without implement in child
        d.give();
    }
}
