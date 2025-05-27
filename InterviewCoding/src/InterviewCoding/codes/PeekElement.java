package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Print elements of a stream during processing without altering the stream. 
public class PeekElement {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(9,5,4,1,3,5,7);
		List<Integer> res=numbers.stream().peek(x->System.out.println(x)).collect(Collectors.toList());
		System.out.println(res);

	}

}

//peek is used for debugging or performing actions without changing the stream. It prints each element before passing it along the stream.

