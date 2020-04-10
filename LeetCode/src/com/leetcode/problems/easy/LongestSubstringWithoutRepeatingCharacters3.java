package com.leetcode.problems.easy;


//Given a string, find the length of the longest substring without repeating characters.

//Example 1:

//Input: "abcabcbb"
//Output: 3

//Explanation: The answer is "abc", with the length of 3. 

public class LongestSubstringWithoutRepeatingCharacters3 {

	public static void main(String...strings) {
		System.out.println(new LongestSubstringWithoutRepeatingCharacters3().lengthOfLongestSubstring("abba"));
	}

	public int lengthOfLongestSubstring(String s) {

		final int NO_OF_CHAR = 256;
		if (s.length() <= 1) {
			return s.length();
		}

		int []visitedCharacter = new int[NO_OF_CHAR];

		int max_length = 1;
		int curr_length = 1;
		int prev_index = -1;

		for (int i = 0; i < visitedCharacter.length; i++) {
			visitedCharacter[i] = -1;
		}

		visitedCharacter[s.charAt(0)] = 0; 

		for (int i = 1; i < s.length(); i++) {
			
			prev_index = visitedCharacter[s.charAt(i)];

			if (prev_index == -1 || i - curr_length > prev_index) {
				curr_length++;
			} else {
				if (max_length < curr_length) {
					max_length = curr_length;
				}
				curr_length = i - prev_index;
			}
			visitedCharacter[s.charAt(i)] = i;
		}
		if (max_length < curr_length) {
			max_length = curr_length;
		}
		return max_length;
	}
}