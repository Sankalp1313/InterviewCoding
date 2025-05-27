package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAscending {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); 
		 
		 //Ascending Sort
		 //Stream<Integer> ascendingSort=myList.stream().sorted((a,b)->Integer.compare(a, b));
		 Stream<Integer> ascendingSort=myList.stream().sorted();
		 ascendingSort.forEach(n->System.out.println("Ascending Sort" + n));
		 
		

	}

}
