package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How to find only duplicate elements with its count from the String ArrayList in Java8? 
public class DuplicateElementswithCount {

	public static void main(String[] args) {
		  List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 Map<String, Long> res= names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 res.entrySet().stream().filter(n->n.getValue()>1).forEach(n->System.out.println(n.getValue() + "->" + n.getKey()) );
		 System.out.println(res);

	}

}
