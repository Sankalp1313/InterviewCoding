package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,5,10,2,8,5,9,6);
		int sum=list.stream().mapToInt(n->n.intValue()).sum();
		
		//int sum = numbers.stream().mapToInt(Integer::intValue).sum();  
		

	}

}
