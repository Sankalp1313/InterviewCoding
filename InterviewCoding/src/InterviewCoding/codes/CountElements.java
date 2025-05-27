package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Count the number of elements in a list that are greater than 5. 
public class CountElements {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,2,7,1,3,4,8);
		List<Integer> filtered=list.stream().filter(n->n>5).collect(Collectors.toList());
		System.out.println("Those nums are: "+filtered);
		
		System.out.println("Count is: "+list.stream().filter(n->n>5).count());
		//System.out.println("Count is: "+list.size());
		

	}

}
