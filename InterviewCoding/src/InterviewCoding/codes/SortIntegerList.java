package InterviewCoding.codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort a list of integers in ascending order. 
public class SortIntegerList {

	public static void main(String[] args) {
		List<Integer> integer=Arrays.asList(5,2,7,1,3,8);
		List<Integer> sorted=integer.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		//to sort in descending order
		//List<Integer> sortedDesc = integer.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		List<Integer> sortedDesc =integer.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedDesc);    

	}

}
