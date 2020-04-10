package hashing_and_hash_tables;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class WordCloud
{
    public Map<String, Integer> wordsToCounts;
    
    public WordCloud() {
        this.wordsToCounts = new HashMap<String, Integer>();
    }
    
    public static void main(final String[] args) {
        new WordCloud().populateWordsToCounts("Mmm...mmm...decisions...decisions\t");
    }
    
    private void populateWordsToCounts(final String inputString) {
        final List<String> words = splitWords(inputString);
        for (final String word : words) {
            if (!this.wordsToCounts.containsKey(word)) {
                this.wordsToCounts.put(word, 1);
            }
            else {
                this.wordsToCounts.put(word, this.wordsToCounts.get(word) + 1);
            }
        }
        System.out.println(this.wordsToCounts);
    }
    
    public static List<String> splitWords(final String inputString) {
        final List<String> words = new ArrayList<String>();
        int currentWordStartIndex = 0;
        int currentWordLength = 0;
        for (int i = 0; i < inputString.length(); ++i) {
            final char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                if (currentWordLength == 0) {
                    currentWordStartIndex = i;
                }
                ++currentWordLength;
            }
            else {
                final String currentWord = inputString.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
                words.add(currentWord);
                currentWordLength = 0;
            }
        }
        final String currentWord2 = inputString.substring(currentWordStartIndex, currentWordStartIndex + currentWordLength);
        words.add(currentWord2);
        return words;
    }
}