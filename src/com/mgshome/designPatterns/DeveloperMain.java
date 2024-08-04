package com.mgshome.designPatterns;

//factory design pattern
public class DeveloperMain {
    public static void main(String[] args) {

        Developers developers1 = DeveloperFactory.getDevelopers("Web Developer");
        if (developers1 != null) {
            System.out.println(developers1.salary());
        }
        Developers developers2 = DeveloperFactory.getDevelopers("Android Developer");
        if (developers2 != null) {
            System.out.println(developers2.salary());
        }
    }
}
