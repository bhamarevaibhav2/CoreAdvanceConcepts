package com.mgshome.oops;

//class
public class Mainclass {

    public static void main(String[] args) {

        System.out.println("--------------Interface---------------");
        Dog d = new Dog();
        Cat c = new Cat();
        //Static method you can call using interface name
        Animal.Given();

        //default method you can call using child class object without implement in child
        d.give();

        d.eat();

        c.eat();
        System.out.println("---------Abstract class----------");

        //static method access using abstract class name
        Animal2.run();

        //object
        Dog2 d2 = new Dog2();

        //abstract class concrete method calling using child class object
        d2.main();

        //abstract method of abstract class implements in child class call using child class object
        d2.sleep();
        System.out.println("---------------Inheritance----------------");

        BMW bm = new BMW();
        bm.Start();
        ThreeXO th = new ThreeXO();
        th.Start();

        System.out.println("--------------------String,StringBuilder,StringBuffer--------");

        String str = "Vaibhav"; //string literal
        str.concat("Bhamare");
        System.out.println(str); //only vaibhav because of String immutable

        str = str.concat("Bhamare");
        System.out.println(str); //VaibhavBhamare because of new object create in SCP(String constant pool)


        //Not thread safe
        StringBuilder sb = new StringBuilder("Vaibhav");
        sb.append("Bhamare");
        System.out.println(sb); //VaibhavBhamare because of String builder is not immutable

        //Thread safe and synchronised less efficient because of thread safe
        StringBuffer sf = new StringBuffer("Vaibhav");
        sf.append("Bhamare");
        System.out.println(sf);

        System.out.println("---------Static---------");
        //run static block first
        //run static method using class name no need to create object of class and only one time assign memory for static
        StaticConcept.stname("Vaibhav");
        StaticConcept.stname(101);

        //we can declare class as static but only for nested class
        StaticConcept.innerClass in = new StaticConcept.innerClass();
        in.run();

        System.out.println("CollageId : "+StaticConcept.collageId);
        System.out.println("a : "+StaticConcept.a);
    }
}
