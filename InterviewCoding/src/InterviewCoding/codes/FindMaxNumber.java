package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find the maximum value in a list of integers. 
public class FindMaxNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,5,10,2,8,5,9,6);
		//Optional<Integer> max = list.stream().sorted((a,b)->Integer.compare(a, b)).findFirst();
		
		Optional<Integer> max = list.stream().max((a, b) -> Integer.compare(a, b));
		
		//Optional<Integer> max = numbers.stream().max(Integer::compare); ----this is using method reference		
		
		System.out.println("Max num is: " + max.orElse(-1));
		
		//The max method takes a comparator and returns the maximum element wrapped in an Optional.
		
		Optional<Integer> min=list.stream().min((a,b)->Integer.compare(a, b));
		min.ifPresent(a->System.out.println("Min num is: " +a));	
		
		
	}

}
