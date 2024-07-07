import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> collection = new HashSet<>();
        int operations = 0;

        // Iterate from the end of the list towards the beginning
        for (int i = nums.size() - 1; i >= 0; i--) {
            operations++;
            if (nums.get(i) <= k) {
                collection.add(nums.get(i));
            }
            if (collection.size() == k) {
                break;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        List<Integer> nums = new ArrayList<>();
        System.out.print("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        scanner.close();

        Solution solution = new Solution();
        int result = solution.minOperations(nums, k);
        System.out.println("The minimum number of operations needed: " + result);
    }
}