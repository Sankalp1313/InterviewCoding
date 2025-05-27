package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;

// Reduce a list of integers to their sum.  
public class ReduceListToSum {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers.stream()
		    .reduce(0, (a, b) -> a + b);//Start with 0 as the initial value (called identity).Repeatedly apply the lambda (a, b) -> a + b to combine the elements.This effectively adds all numbers in the list.
		
		System.out.println("Sum is: " + sum);


	}

}
