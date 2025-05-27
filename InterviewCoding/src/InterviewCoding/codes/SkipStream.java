package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Skip the first 2 elements of a list and return the rest. 
public class SkipStream {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(9,5,4,1,3,5,7);
		List<Integer> res=numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println(res);

	}

}
