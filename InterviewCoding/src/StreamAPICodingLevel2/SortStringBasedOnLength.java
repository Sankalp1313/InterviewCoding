package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringBasedOnLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "kiwi");
		
		//way 1
		List<String> res=list.stream().sorted(Comparator.comparing(s->s.length())).collect(Collectors.toList());
		System.out.println(res);
		
		//Way 2
		List<String> res2=list.stream().sorted((a,b)->Integer.compare(a.length(), b.length())).collect(Collectors.toList());
		System.out.println(res2);

	}

}
