package Misc;
public class LongestWord {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "strawberry", "pineapple"};

        String longestWord = findLongestWord(words);

        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String[] words) {
        if (words == null || words.length == 0)
            return null;

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
