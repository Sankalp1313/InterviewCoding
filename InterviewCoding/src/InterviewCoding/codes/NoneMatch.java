package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;

//Check if there are no negative numbers in a list. 
public class NoneMatch {

	public static void main(String[] args) {


		List<Integer> numbers=Arrays.asList(1,3,5,7);
		boolean noneNegative = numbers.stream() 
				.noneMatch(n -> n % 2== 0); //noneMatch checks that no elements match the given condition.
		System.out.println(noneNegative);
	}

}
