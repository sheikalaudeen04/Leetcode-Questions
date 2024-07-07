import java.util.Scanner;

public class Solution {
    public String truncateSentence(String s, int k) {
        // Split the sentence into words
        String[] words = s.split(" ");
        
        // Select the first k words
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read input sentence and k
            String s = scanner.nextLine();
            int k = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after k
            
            // Get truncated sentence
            String result = solution.truncateSentence(s, k);
            System.out.println(result);
        }
        
        scanner.close();
    }
}