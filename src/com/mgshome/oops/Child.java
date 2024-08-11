package com.mgshome.oops;

public class Child extends Parent {

    String color = "black";
    float salary;

    Child(int id, String name,float salary){
        //super();//we can call parent constructor in child class constructor either write or not but write always in first line

        super(id,name);//reusing parent constructor
        this.salary=salary;
        System.out.println("child cons...");
    }


    void printColor() {

        System.out.println(this.color); //this.current invoking object

        System.out.println(super.color);// we can call parent class variable in child class method using super keyword

        super.eat(); // we can call parent method in child method using super keyword

        System.out.println(id+" "+name+" "+salary);

    }

}
