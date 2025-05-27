package StreamAPICodingLevel2;
import java.util.LinkedHashMap; // Used to maintain insertion order while storing character counts
import java.util.Map;
import java.util.function.Function; // For Function.identity() in grouping
import java.util.stream.Collectors; // For collecting stream results

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome"; // Input string to find the first non-repeating character

        Character firstNonRepeating = input.chars() // chars() returns an IntStream where each element is the Unicode value of a character in the string.
            .mapToObj(c->Character.toLowerCase(Character.valueOf((char) c))) // Convert each character code (int) to its Character object
            .collect(Collectors.groupingBy(
                Function.identity(), // Use the character itself as the key for grouping
                LinkedHashMap::new, // Use LinkedHashMap to maintain the order of characters as they appear
                Collectors.counting() // Count the number of times each character appears
            ))
            .entrySet() // Get the entry set (key-value pairs) from the map
            .stream() // Convert the entry set into a stream
            .filter(entry -> entry.getValue() == 1) // Filter out characters that appear more than once
            .map(entry -> entry.getKey()) // Extract only the character (key) from the entry
            .findFirst() // Find the first character in the stream that is non-repeating
            .orElse(null); // Return null if no non-repeating character is found

        System.out.println("First non-repeating character: " + firstNonRepeating); // Print the result
    }
}


//same code but divided into small steps

/*public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        // Step 1: Convert input string to a stream of characters
        // input.chars() → IntStream, mapToObj(c -> (char)c) → Stream<Character>
        var charStream = input.chars()    //chars() returns an IntStream where each element is the Unicode value of a character in the string.
                              .mapToObj(c -> (char) c);

        // Step 2: Create a LinkedHashMap with character counts (to preserve order)
        Map<Character, Long> charCountMap = charStream
            .collect(Collectors.groupingBy(
                Function.identity(),      // Group by the character itself or same as c->c
                LinkedHashMap::new,       // Maintain insertion order or same as ()->new LinkedHashMap()
                Collectors.counting()     // Count occurrences
            ));

        // Step 3: Iterate over the map and find the first character with count = 1
        Character firstNonRepeating = charCountMap.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1) // Only characters that occurred once
            .map(entry->entry.getKey())                 // Get the character
            .findFirst()                            // Return the first match
            .orElse(null);                          // If none found, return null

        // Step 4: Print the result
        System.out.println("First non-repeating character: " + firstNonRepeating);
    }
}*/
