package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Limit the output to the first 3 elements of the list. 
public class LimitStream {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(9,5,4,1,3,5,7);
		List<Integer> res=numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(res);

	}

}

//limit truncates the stream to be no longer than the specified size.
