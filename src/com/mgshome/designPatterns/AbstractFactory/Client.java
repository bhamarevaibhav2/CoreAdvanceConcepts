package com.mgshome.designPatterns.AbstractFactory;

public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.createEmployee(new AndroidDevFactory());

        System.out.println(e1.getName());

        Employee e2 = EmployeeFactory.createEmployee(new WebDevFactory());

        System.out.println(e2.getName());
    }
}
