package com.mgshome.oops;

import java.util.ArrayList;
import java.util.List;

import com.mgshome.oops.Employee;

public class MyclassMain {
	
	int a = 2;
	
	public void m4()
	{
		try {
			int ab = a/0;
			System.out.println(ab);
			
		} catch (ArithmeticException e1) {
			System.out.println("Arithmatic "+e1);
		}
		catch (Exception e) {
			System.out.println("eXception "+e);
		}
		finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {

		//lambda expression
		/*
		 * MyInterface my = (ab) -> { int sum = ab+ab; return sum; };
		 * System.out.println("sum :"+my.m2(3));
		 *
		 * MyclassMain main = new MyclassMain(); main.m4();
		 */

//		Employee emp = new Employee("Vaibhav","bhamare","vb@gmail.com");
//
//		Employee emp1 = new Employee("Aishal","bha","b@gmail.com");
//
//		Employee emp2 = new Employee("Za","bhame","vbr@gmail.com");


//		ArrayList<Employee> list = new ArrayList<>();
//
//		list.add(emp);
//
//		list.add(emp2);
//
//		list.add(emp1);
//
//		list.sort((o1,o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
//
//		for(Employee em : list) {
//
//			System.out.println(em.getFirstName());
//		}
//
//	}
	}
}
