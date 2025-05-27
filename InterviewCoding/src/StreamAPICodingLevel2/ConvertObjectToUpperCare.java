package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;

//How to use map to convert object into Uppercase in Java 8?
public class ConvertObjectToUpperCare {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("aa","bb","cc");
		list.stream().map(n->n.toUpperCase()).forEach(System.out::println);;
		

	}

}
