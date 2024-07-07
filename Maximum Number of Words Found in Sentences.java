public class Solution {
    public static int mostWordsFound(String[] sentences) {
        int maxWordCount = 0;
        
        for (String sentence : sentences) {
            // Split the sentence into words
            String[] words = sentence.split("\\s+");
            // Count the number of words
            int wordCount = words.length;
            // Update maxWordCount if needed
            if (wordCount > maxWordCount) {
                maxWordCount = wordCount;
            }
        }
        
        return maxWordCount;
    }
    
    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences1));  // Output: 6
        
        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences2));  // Output: 3
    }
}
