package com.mgshome.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mymainclasss {

	public static void main(String[] args) {

		// Anonymous class
//		Features f = new Features() {
//
//			public void sayHello() {
//				System.out.println("Hello");
//			}
//		};
//		f.sayHello();

		// LAMBDA expression
		Methodinter fea = () -> {
			System.out.println("Hello vaibhav");
		};
		fea.sayBye();

		ArrayList<Students> stlist = new ArrayList<>();
		stlist.add(new Students(111, "Suhas"));
		stlist.add(new Students(101, "Zebra"));

		ArrayList<Integer> intlist = new ArrayList<>();

		intlist.add(12);
		intlist.add(14);
		intlist.add(22);
		intlist.add(10);
		intlist.add(42);

		// stream api
		// A stream is an abstraction to express data processing queries in a
		// declarative way.
		long count = intlist.stream().filter(x -> x > 20).count();
		System.out.println(count);

		List<Integer> list2 = intlist.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(list2);

		ArrayList<String> stringlist = new ArrayList<>();
		stringlist.add("Dipak");
		stringlist.add("Dinesh");
		stringlist.add("Rakesh");
		stringlist.add("Sanchit");
		stringlist.add("Akash");
		stringlist.add("Akansha");

		List<String> list = stringlist.stream().filter(s -> s.startsWith("D")).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("----------Foreach----------");
		stringlist.stream().filter(d -> d.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("----------Foreach----------");

		// find out all the numbers starting with 1
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("1")).forEach(System.out::println);

		// find duplicate elements
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		// find the first element of the list
		myList.stream().findFirst().ifPresent(System.out::println);

		// find the total number of elements
		long counts = myList.stream().count();
		System.out.println(counts);

		// find the maximum value element
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);

		// sort all the values present in it in descending order
		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		

		//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		int[] nums = {1,2,3};
		List<Integer> listof = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> setof = new HashSet<>(listof);
		if (setof.size() == listof.size()) {
			System.out.println("false");
		} else
			System.out.println("true");
		
		

		String input = "Java articles are Awesome";
		// find the first non-repeated character
		Stream<Character> mapToObj = input.chars().mapToObj(s -> Character.valueOf((char) s));
		LinkedHashMap<Character, Long> collect = mapToObj
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect);
		Set<Entry<Character, Long>> entrySet = collect.entrySet();
		System.out.println(entrySet);
		Stream<Entry<Character, Long>> stream = entrySet.stream();
		System.out.println(stream);
		Stream<Entry<Character, Long>> filter = stream.filter(entry -> entry.getValue() == 1L);
		System.out.println(filter);
		Stream<Boolean> map1 = filter.map(entry -> entry.getValue() == 1L);
		System.out.println(map1);

	}
}
