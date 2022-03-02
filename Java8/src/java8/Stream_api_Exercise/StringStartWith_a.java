package java8.Stream_api_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringStartWith_a {

	public static void main(String[] args) {
		 //From the given list of strings, count the number of String that starts with "a".
		List<String> la=Arrays.asList("abhi","saurabh","sachin","yugant","aditi","ashneer","arnav");
		Stream<String> stream = la.stream();
			long count =  stream
				.filter(i -> i. startsWith("a"))
				.count();	
			System.out.println(count);
		}

}
