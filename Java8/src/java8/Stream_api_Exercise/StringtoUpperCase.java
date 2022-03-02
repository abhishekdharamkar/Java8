package java8.Stream_api_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringtoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//From the given list of strings, Convert String to uppercase and Join them with coma.
		List<String> la=Arrays.asList("abhi","saurabh","sachin","yugant","aditi","ashneer","arnav");
		
		List<String> l2=la.stream()
						.map(x->x.toUpperCase())
						.collect(Collectors.toList());
		System.out.println(l2);
	}

}
