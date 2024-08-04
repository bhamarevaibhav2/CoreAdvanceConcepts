package com.mgshome.java8;

import java.util.Optional;

public class OptionalclassDemo {

	// optional class
	// To avoid abnormal termination, we use the Optional class
	public static void main(String[] args) {

		String[] words = new String[10];
		String[] words2 = new String[10];
		words[0] = "My Geeks";
		//words[5] = "MY";
		words[2] = "2";

		Optional<String> checkNull = Optional.ofNullable(words[5]);

		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("words is null");
		
		System.out.println("-------------------------------");
		
		Optional<String> empty = Optional.empty();
		
		System.out.println(empty);
		
		Optional<String> value = Optional.of(words[2]);
        System.out.println(value);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());
		System.out.println(words.equals(words2));
		System.out.println(value.filter(x -> x.equals("2")));
		
		
	
	}

}
