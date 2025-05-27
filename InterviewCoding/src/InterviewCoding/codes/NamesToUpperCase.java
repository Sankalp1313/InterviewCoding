package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert all strings in a list to uppercase. 
public class NamesToUpperCase {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Sankalp", "swati","java");
		List<String> upperNames = names.stream()
			    .map(name -> name.toUpperCase())  //.map(String::toUpperCase)
			    .collect(Collectors.toList());

		System.out.println(upperNames);

	}

}
