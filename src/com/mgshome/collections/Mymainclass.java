package com.mgshome.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mymainclass {

    public static void main(String[] args) {

        //using comparable you can sort one time or for one member on the same class implements
        //using comparator you can sort multiple time or for all member with creating new class for each member
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(23, "Vaibhav"));
        students.add(new Student(24, "Vibhav"));
        students.add(new Student(11, "Ram"));
        students.add(new Student(20, "Amol"));

        // Collections.sort(students); //comparable
        Collections.sort(students, new Byname()); //comparator

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
