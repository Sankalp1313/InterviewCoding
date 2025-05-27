package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortDescending {

	public static void main(String[] args) {

		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); 
		
		 myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);;
		 
		// Stream<Integer> DescedingSort=myList.stream().sorted((b,a)->Integer.compare(a, b));		
		// DescedingSort.forEach(System.out::println);

	}

}
