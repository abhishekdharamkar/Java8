package java8.Stream_api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamapiex {
	public static void main(String arg[]) {
		
		List <Integer> list1=List.of(2,8,9,11,4); //immutable list
		
		//want even number and store in new list
		//without stream
		List <Integer> listeven =new ArrayList<>();
		for(Integer i: list1) {
			if(i%2==0) {
				listeven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listeven);
		
		//using stream Api
		Stream<Integer> stream= list1.stream();
		Stream<Integer> stream2= list1.stream();
		List <Integer> newlist = stream.filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("BY USING STREAM -- "+newlist);
		
		List <Integer> new2=list1.stream().filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println("BY USING STREAM -- "+newlist);
		
		List <Integer> new3 =stream2.filter(i-> i>8).collect(Collectors.toList());
		System.out.println(new3);
		
	}
	

}
