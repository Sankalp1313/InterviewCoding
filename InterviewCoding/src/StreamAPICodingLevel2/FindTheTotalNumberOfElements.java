package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheTotalNumberOfElements{ 
	  public static void main(String args[]) { 
	          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	          
	         //System.out.println( myList.stream().count());
	          
	         long num= myList.stream().count();
	         System.out.println(num);
	          

    }
}

