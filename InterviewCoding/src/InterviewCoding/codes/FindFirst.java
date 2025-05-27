package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find the first element in a list of integers. 
public class FindFirst {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(9,3,5,7);
		Optional<Integer> res=numbers.stream().findFirst();
		System.out.println(res.orElse(-1));
		//findFirst returns the first element of the stream, wrapped in an Optional.

	}

}
