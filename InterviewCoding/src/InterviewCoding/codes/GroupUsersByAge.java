package InterviewCoding.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Group users by age. 
public class GroupUsersByAge {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Sankalp", 28);
		map.put("Swati", 27);
		map.put("Gajanan", 54);
		map.put("Mahadevi", 54);
		
		System.out.println(map.entrySet().stream().collect(Collectors.groupingBy(x->x.getValue())));
		
		
		/*
		 * Map<String,Integer> map1=Map.of("Sankya",23,"swa",12);
		 * System.out.println(map1);
		 */

	}

}
