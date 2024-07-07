class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        index = word.find(ch)
        
        if index != -1:
            reversed_segment = word[:index+1][::-1]
            remaining_part = word[index+1:]
            return reversed_segment + remaining_part
        else:
            return word
