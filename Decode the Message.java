import java.util.*;

public class Solution {
    
    // Function to decode the message using the given key
    public static String decodeMessage(String key, String message) {
        // Create a substitution table based on the key
        Map<Character, Character> substitutionTable = new HashMap<>();
        int index = 0;
        
        // Populate the substitution table using the first appearance of each letter in the key
        for (char ch : key.toCharArray()) {
            if (Character.isLowerCase(ch) && !substitutionTable.containsKey(ch)) {
                substitutionTable.put(ch, (char) ('a' + index++));
                if (index >= 26) break; // We only need to fill in for a-z
            }
        }
        
        // Decode the message using the substitution table
        StringBuilder decodedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                decodedMessage.append(substitutionTable.getOrDefault(ch, ch));
            } else {
                decodedMessage.append(ch); // Keep non-letter characters unchanged
            }
        }
        
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the key and message
        String key = scanner.nextLine();
        String message = scanner.nextLine();
        
        // Decode the message
        String decodedMessage = decodeMessage(key, message);
        
        // Output the decoded message
        System.out.println(decodedMessage);
        
        scanner.close();
    }
}