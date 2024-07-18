package com.mgshome.java8;

public class Mymainclass {

    public static void main(String[] args) {

        //use of lambda expression in thread creation
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


//        Employee employee = (String name) -> { return name; };
        Employee employee = name -> name; //you can write
        System.out.println("------------------- functional interface with lambda expression and default,static method------------------");
        String empName = "vaibhav";
        System.out.println(employee.getName(empName));
        employee.getSalary(); //default method allows from java 8
        Employee.getBite(); // static method allows from java8

        System.out.println("-------------------Anonymous class------------------");
        Employee employee1 = new Employee() {
            @Override
            public String getName(String NextName) {
                return NextName;
            }
        };
        employee1.getName("Rahul");

        System.out.println("-------------------Anonymous inner Class for multiple methods in interface------------------");
        //use as implementation class of interface because in interface multiple methods then no functional interface
        Student student1 = new Student() {

            @Override
            public void getMarks() {

                System.out.println("getMarks of inner class");
            }
            @Override
            public void getScore() {
                System.out.println("getScore of inner class");
            }
        };

        student1.getMarks();
        student1.getScore();
    }
}
