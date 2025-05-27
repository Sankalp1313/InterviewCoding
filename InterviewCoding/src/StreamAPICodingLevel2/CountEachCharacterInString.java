package StreamAPICodingLevel2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a program to print the count of each character in a String?
public class CountEachCharacterInString {

	public static void main(String[] args) {

		String s="HhelloSankya".toLowerCase();
		Map<Character,Long> res=s.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(res);

	}

}
