package hashing_and_hash_tables;

import java.util.Set;
import java.util.HashSet;

public class StringPalindrome
{
    public static void main(final String... strings) {
        System.out.println(hasPalindromePermutation(new String("ccaqqqqiivv")));
    }
    
    public static boolean hasPalindromePermutation(final String theString) {
        final Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < theString.length(); ++i) {
            if (!set.contains(theString.charAt(i))) {
                set.add(theString.charAt(i));
            }
            else {
                set.remove(theString.charAt(i));
            }
        }
        return set.size() <= 1;
    }
}