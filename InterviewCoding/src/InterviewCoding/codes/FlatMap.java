package InterviewCoding.codes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {	

	    public static void main(String[] args) {
	        List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("apple", "banana"),
	            Arrays.asList("cat", "dog"),
	            Arrays.asList("elephant", "fish")
	        );

	        // Using Java 8 streams
	        List<String> result= listOfLists.stream()
	                   .flatMap(x->x.stream()) // Flatten the list of lists to a single stream of strings
	                   .collect(Collectors.toList());
	        System.out.println(result);        
	    
	                   
	    }
	}

	/*
	 * flatMap method in Java 8's Stream API is used when you have nested structures
	 * (like a List<List<T>>) and you want to flatten them into a single stream
	 * (Stream<T>).
	 */