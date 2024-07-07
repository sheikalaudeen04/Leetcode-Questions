class Solution:
    def defangIPaddr(self, address: str) -> str:
        return address.replace('.', '[.]')

# Example usage:
solution = Solution()

address1 = "1.1.1.1"
print(solution.defangIPaddr(address1))  # Output: "1[.]1[.]1[.]1"

address2 = "255.100.50.0"
print(solution.defangIPaddr(address2))  # Output: "255[.]100[.]50[.]0"
