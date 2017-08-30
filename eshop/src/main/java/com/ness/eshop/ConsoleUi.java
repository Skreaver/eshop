package com.ness.eshop;

import io.vavr.collection.List;
import io.vavr.collection.SortedSet;
import io.vavr.collection.TreeSet;
import io.vavr.control.Try;

public class ConsoleUi {

	
	//private List<String> otherList = Arrays.asList("skuska", "dva");


	public void run() {
		
		System.out.println(divide(25.0, 3.0).toString());	
		addToList();
		getValues();
	}
	
	
	public Try<Double> divide(Double dividend, Double divider){	
		 return Try.of(() -> dividend/divider);	
	
	}
	
	public void addToList() {
		List<Integer> list1 = List.of(1,2,3);
		List<Integer> list2 = list1.tail().prepend(6);
		System.out.println(list2);
	}
	
	
	SortedSet<Integer> sx = TreeSet.ofAll(1,2,5,8,6,4,7,9);
	
	public void getValues() {
		for(Integer i : sx) {
			System.out.println(i);
		}
	}


}
