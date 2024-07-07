import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the numbers and their indices
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement is already in the hash map
            if (numToIndex.containsKey(complement)) {
                // If found, return the indices
                return new int[] { numToIndex.get(complement), i };
            }
            
            // If not found, add the current number and its index to the hash map
            numToIndex.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though the problem guarantees exactly one solution)
        return new int[0];
    }
}