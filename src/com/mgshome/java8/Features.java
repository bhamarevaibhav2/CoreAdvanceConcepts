package com.mgshome.java8;

@FunctionalInterface
public interface Features {
	
	//functional interface cant extends other interface that have abstract method
	
	public abstract int sayHello(int count);
	
	public default String HelloWorld() { 
		return "Hello World"; 
		} 

}
