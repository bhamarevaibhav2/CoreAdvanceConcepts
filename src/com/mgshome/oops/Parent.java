package com.mgshome.oops;

public class Parent{

	String color = "white";
	public int id;  
	public String name;
	public float salary;
	public static String all = "BTS"; //The static variable gets memory only once in the class area at the time of class loading. class area variable
	
	Parent(){
		System.out.println("parent default constructor");
	}
	
	Parent(int id, String name){
		this(); //you can invoke constructor using this()
		System.out.println("parent cons...");
		this.id=id;  //this refer to the current class object
		this.name=name;
	}

	void eat() {
		System.out.println("eating...");
	}
	
	static void start() {
		//only static variable allow operation
		//A static method can access static data member and can change the value of it.can invoke without creating object
		all= "BTDS";
	}

}