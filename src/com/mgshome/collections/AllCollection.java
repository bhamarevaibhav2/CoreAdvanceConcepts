package com.mgshome.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllCollection {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------Set----------");
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");//duplicates not allowed in set

        for (String s : set) {
            System.out.println(s);
        }

    }
}
