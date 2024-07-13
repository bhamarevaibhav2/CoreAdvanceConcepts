package com.mgshome.oops;

public class BMW extends FourWheeler{

    int engineNo =123;


    BMW(){
        super();
        System.out.println("BMW Constructor");
        System.out.println(engineNo);//124 parent class variable value taken if not available in child class
        System.out.println(this.engineNo);//123 this means current invoking objet
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("BMW Starting...");
    }
}
