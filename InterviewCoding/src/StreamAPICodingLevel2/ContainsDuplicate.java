package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. 

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) { 
		
		    List<Integer> list = Arrays.stream(nums) 
		                               .boxed() 
		                               .collect(Collectors.toList()); 
		    Set<Integer> set = new HashSet<>(list); 
		     if(set.size() == list.size()) { 
		       return false; 
		   }  
		      return true;
	}
	public static void main(String[] args) {		  
		
		int a[]= {1,2,4,3};
		System.out.println(ContainsDuplicate.containsDuplicate(a));

	}

}


