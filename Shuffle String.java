import java.util.Scanner;

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] restored = new char[s.length()];
        
        for (int i = 0; i < indices.length; i++) {
            restored[indices[i]] = s.charAt(i);
        }
        
        return new String(restored);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Get string input
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        // Get indices input
        System.out.print("Enter the indices separated by spaces: ");
        String[] indicesStr = scanner.nextLine().split(" ");
        int[] indices = new int[indicesStr.length];
        
        for (int i = 0; i < indicesStr.length; i++) {
            indices[i] = Integer.parseInt(indicesStr[i]);
        }

        scanner.close();

        // Call restoreString method
        String restoredString = solution.restoreString(s, indices);

        // Print the result
        System.out.println("Restored string: " + restoredString);
    }
}
