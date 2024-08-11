package com.mgshome.java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

//java 1.8
public class Streamapis {

	public List<String> cities;

	public Streamapis(List<String> cities) {
		super();
		this.cities = cities;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Streamapi [cities=" + cities + "]";
	}

	// stream(),filter(),collect(),Collectors.toList(),foreach(System.out::println),Collectors.toSet(),
	public static void main(String[] args) {

		List<String> citylist1 = new ArrayList<>();
		citylist1.add("Pune");
		citylist1.add("Mumbai");
		citylist1.add("Nashik");
		Streamapis st1 = new Streamapis(citylist1);

		List<String> citylist2 = new ArrayList<>();
		citylist2.add("Pune");
		citylist2.add("Mumbai");
		citylist2.add("Nashik");
		Streamapis st2 = new Streamapis(citylist2);
		
		List<Streamapis> stplist = new ArrayList<>();
		stplist.add(st1);
		stplist.add(st2);

		List<Integer> list = Arrays.asList(2,3,4,6,8,10); // immutable
		List<Integer> list1 = new ArrayList<>(); // = List.of(8,2,3,4,6,10,11,12); // immutable
		System.out.println(list + "---" + list1);

		// without stream even numbers
		List<Integer> listeven = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listeven.add(i);
			}
		}
		System.out.println(listeven);

		// with stream api
		List<Integer> evenlist = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenlist);

		// find names that start with A character
		List<String> names = Arrays.asList("Satish", "Arun", "Kavita", "Avinash", "Arvind", "EKnath", "Satish");
		// duplicates allow
		List<String> list2 = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

		// not duplicates allow
		Set<String> set = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toSet());

		System.out.println("List -> " + list2);
		System.out.println("Set -> " + set);

		// forEach loop
		names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toSet()).forEach(System.out::println);

		// map
		List<Integer> squareofnum = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(squareofnum);

		// flatmap
		List<List<String>> list3 = stplist.stream().map(itr -> itr.getCities()).collect(Collectors.toList());
		List<String> list4 = stplist.stream().flatMap(itr -> itr.getCities().stream()).collect(Collectors.toList());
		Set<String> set2 = stplist.stream().flatMap(itr -> itr.getCities().stream()).collect(Collectors.toSet());
		System.out.println("map -> "+list3);
		System.out.println("flatmap -> "+list4);
		System.out.println(set2);
		

		// min,max
		Integer minval = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(minval);
		Integer maxval = list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(maxval);

		// sorted
		List<Integer> list5 = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list5);

		//optional in java 8
		String str = null;
		Optional<String> op = Optional.ofNullable(str);
		System.out.println(op.isPresent());
		// op.get();

		//in list find all elements square and filter by above 100 and average using mapToInt()
		OptionalDouble opt = list1.stream().mapToInt(n -> n*n).filter(n -> n>100).average();
		
		System.out.println(opt);
	}

}
