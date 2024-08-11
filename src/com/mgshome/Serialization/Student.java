package com.mgshome.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    public String name;
    transient public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
