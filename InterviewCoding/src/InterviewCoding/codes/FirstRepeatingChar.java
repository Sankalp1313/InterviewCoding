package InterviewCoding.codes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		
		var inChar=input.chars().mapToObj(c->(char)c);
		    Map<Character,Long> map=inChar.collect(Collectors.groupingBy(c->c, ()->new LinkedHashMap(), Collectors.counting()));
		    Character res=map.entrySet().stream().filter(c->c.getValue()>1).map(c->c.getKey()).findFirst().orElse(null);
		    System.out.println("First Repeating Character is: "+ res);

	}

}
