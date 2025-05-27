package InterviewCoding.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, return a list containing only even numbers. 
public class FilterEvenNumber {

	public static void main(String[] args) {
	    List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
	    List<Integer> evenNumber=list.stream().filter(n->n%2==0).collect(Collectors.toList());
	    System.out.println(evenNumber);
	    //The filter method is used to apply a condition that keeps only even numbers. 
	    //The collect method gathers the results into a new list. 

	}

}
