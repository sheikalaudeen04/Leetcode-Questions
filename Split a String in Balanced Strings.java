class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int maxSplits = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                balance++;
            } else if (ch == 'R') {
                balance--;
            }
            
            // Whenever balance is zero, we have a balanced substring
            if (balance == 0) {
                maxSplits++;
            }
        }

        return maxSplits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.balancedStringSplit("RLRRLLRLRL")); // Output: 4
        System.out.println(solution.balancedStringSplit("RLRRRLLRLL")); // Output: 2
        System.out.println(solution.balancedStringSplit("LLLLRRRR"));   // Output: 1
    }
}