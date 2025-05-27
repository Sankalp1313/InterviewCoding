package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class PerformQubeAndFilter {

	public static void main(String[] args) {
	    List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3); 
	    integerList.stream().map(n->n*n*n).filter(n->n>50).forEach(System.out::println);

	}

}
