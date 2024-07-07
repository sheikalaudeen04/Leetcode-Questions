class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        # Convert the jewels string into a set for O(1) average-time complexity checks
        jewel_set = set(jewels)
        
        # Count the number of stones that are also jewels
        count = 0
        for stone in stones:
            if stone in jewel_set:
                count += 1
        
        return count

# Example usage
solution = Solution()
print(solution.numJewelsInStones("aA", "aAAbbbb"))  # Output: 3
print(solution.numJewelsInStones("z", "ZZ"))        # Output: 0
