package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
// Extract first names from a list of full names. 

public class ExtractFirstName {

	public static void main(String[] args) {
      List<String> names=Arrays.asList("sankalp patil", "swati patil2");     
      
      List<String> res=names.stream().map(name->name.split(" ")[0]).collect(Collectors.toList());
      System.out.println(res);
      // The map function splits each name string and selects the first part. 

	}

}
