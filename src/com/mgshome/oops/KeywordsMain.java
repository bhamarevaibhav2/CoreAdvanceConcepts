package com.mgshome.oops;

public class KeywordsMain {
	
	//static block always start before all at the time of class loading
	static {
			System.out.println("static block");
		}
	
	public static void main(String[] args) {
		
		Child c = new Child(1,"Vivek",10000);
		c.printColor();
		
		Child.start();//you can invoke without creating object. you can invoke using class name.
		
	}
	
	
}

