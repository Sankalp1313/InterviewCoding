package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;

// Check if all numbers in a list are positive.  
public class AllMatch {

	public static void main(String[] args) {

       List<Integer> numbers=Arrays.asList(1,2,3,4,5,-6,7,8,9);
		boolean allPositive = numbers.stream() 
				.allMatch(n -> n > 0);
		System.out.println(allPositive);

	}

}
