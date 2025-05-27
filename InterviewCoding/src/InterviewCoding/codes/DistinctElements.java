package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Get a list of distinct elements from a list of integers. 
public class DistinctElements {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,2,7,4,5,3,1,3,4,8);
		List<Integer> distinct=list.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique elements are: "+ distinct);
	}

}
