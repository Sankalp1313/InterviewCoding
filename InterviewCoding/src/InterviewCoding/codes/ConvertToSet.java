package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Convert a list of integers to a set to remove duplicates. 
public class ConvertToSet {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(9,5,4,1,3,5,7);
		Set<Integer> res=numbers.stream().collect(Collectors.toSet());
		System.out.println(res);

	}

}
