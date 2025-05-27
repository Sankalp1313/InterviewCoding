package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32); 
		 List<Integer> res=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		 System.out.println("Output 1: "+ res);
		

	}

}
