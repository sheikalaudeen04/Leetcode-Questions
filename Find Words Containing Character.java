import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Get words input
        System.out.print("Enter words separated by spaces: ");
        String[] words = scanner.nextLine().split(" ");

        // Get character input
        System.out.print("Enter the character to search for: ");
        char x = scanner.next().charAt(0);

        scanner.close();

        // Call findWordsContaining method
        List<Integer> indices = solution.findWordsContaining(words, x);

        // Print the result
        System.out.println("Indices of words containing '" + x + "': " + indices);
    }
}