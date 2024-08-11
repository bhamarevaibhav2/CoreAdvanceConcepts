package com.mgshome.java8.lambdaExpression;

import com.mgshome.java8.FunctionalInterface.Features;

public class MethodReference {
	
	MethodReference(){
		System.out.println("Constructor..");
	}

	public static int saidHello(int count) {

		return count;
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	// non static method
	public void saySomething() {
		System.out.println("Bye, this is non-static method.");
	}

	public static void main(String[] args) {

		//1.
		// method reference for static method
		Features ft = MethodReference::saidHello;
		int i = ft.sayHello(12);
		System.out.println(i);

		//2. method reference for non static method
		MethodReference m = new MethodReference();
		Methodinter mein = m::saySomething;
		//Methodinter mein = new MethodReference()::saySomething;
		mein.sayBye();

		//3. for predefine functional interface refer to static method
		Thread t2 = new Thread(MethodReference::ThreadStatus);
		Thread t3 = new Thread(new MethodReference()::saySomething);
		t2.start();

		//without method reference
		int j = MethodReference.saidHello(13);
		System.out.println(j);
		
		//4. constructor calling
		Methodinter method = MethodReference::new;
		method.sayBye();
	}

}
