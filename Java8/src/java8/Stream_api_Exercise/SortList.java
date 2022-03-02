package java8.Stream_api_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> la=Arrays.asList("abhi","saurabh","sachin","yugant","aditi","ashneer","arnav");
		Stream <String>s = la.stream();
		
		List<String> l = la.stream()
							.sorted().collect(Collectors.toList());
		System.out.println(l);
							

}
}
