package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxElement {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); 
		 Optional<Integer> res=myList.stream().max((a,b)->Integer.compare(a, b)); //max(Integer::compare)
		 System.out.println(res.get());
	}

}
