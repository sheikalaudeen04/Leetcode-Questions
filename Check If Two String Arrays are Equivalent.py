from typing import List

class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        concat1 = ''.join(word1)
        concat2 = ''.join(word2)
        
        return concat1 == concat2
