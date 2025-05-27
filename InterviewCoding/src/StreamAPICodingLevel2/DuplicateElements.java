package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);

        //Way 1
        Set<Integer> duplicates = myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), // group by the element itself
                		Collectors.counting()))                     // count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());

            System.out.println("Duplicate numbers Way 1: " + duplicates);
            
       // -----------------------------------------------------------------------------------
        //Way 2
        Set<Integer> set = new HashSet<>();

        // Collect only unique duplicates
        Set<Integer> duplicates1 = myList.stream()
            .filter(n -> {
                return !set.add(n);  // returns true if already present
            })
            .collect(Collectors.toSet());

        System.out.println("Duplicate values Way 2: " + duplicates1);
        
        
       
    }
}

