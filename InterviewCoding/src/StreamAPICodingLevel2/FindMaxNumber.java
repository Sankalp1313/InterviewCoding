package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Write a Program to find the Maximum element in an array? 
public class FindMaxNumber {
	public static int findMaxElement(int[] arr) { 
		  return Arrays.stream(arr).max().getAsInt(); 
		}
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		 System.out.println(findMaxElement(arr));

	}

}
