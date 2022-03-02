package java8.ForeEach;

import java.util.Arrays;
import java.util.List;

public class ForEachex {

	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(1,2,7,8,5,4);
		
// In old java version we do like this 		
//		for(int i =0;i<l.size();i++) {
//			System.out.println(l.get(i));
//		}

		
		//ForEach In JAVA 8
			l.forEach(i -> System.out.println(i));
	}

}
