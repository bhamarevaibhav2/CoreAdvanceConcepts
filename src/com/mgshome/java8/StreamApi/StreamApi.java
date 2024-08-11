package com.mgshome.java8.StreamApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> stringlist = new ArrayList<String>();
        List<Integer> integerlist = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();

        stringlist.add("Dipak");
        stringlist.add("Dinesh");
        stringlist.add("Rahul");
        stringlist.add("Dipak");
        stringlist.add("Sanjay");

        System.out.println("---filter predicate for start letter D");
        stringlist.stream().filter(s -> s.startsWith("D")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---toSet for remove duplicates");
        stringlist.stream().filter(s -> s.startsWith("D")).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Integer arraylist");
        integerlist.add(12);
        integerlist.add(1);
        integerlist.add(14);
        integerlist.add(0);
        integerlist.add(9);
        integerlist.add(1);
        System.out.println("Sorted List");
        integerlist.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Distinct list");
        integerlist.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Map use");
        integerlist.stream()
                .map(s -> s+"")//convert int to string
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("Duplicate list");
        //add duplicate elements in set
        integerlist.stream().filter(n -> !set.add(n)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("find first element with check in present list");
        integerlist.stream().findFirst().ifPresent(System.out::println);
        System.out.println("find count element list");
        long count = integerlist.size(); //or stream().count();
        System.out.println(count);
        System.out.println("Max and min");
        int max = integerlist.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        int min = integerlist.stream()
                .min(Integer::compare)
                .get();
        System.out.println(min);


    }
}
