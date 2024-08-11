package com.mgshome.java8.FunctionalInterface;

@FunctionalInterface
public interface Employee {

    String getName(String name);

    default void getSalary() {
        System.out.println("Default method- Salary...");
    }

    public static void getBite(){
        System.out.println("Static method- Bite...");
    }
}
