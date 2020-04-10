package array_and_string_manipulations;

public class ReverseString {
	
	public static void main(String... strings) {
		String word = "Abhishek Goyal";
		System.out.println(new ReverseString().reverseString(word.toCharArray(), 0, word.length()-1));
	}
	
	//Time Complexity ~ O(n)
	public char[] reverseString(char []word, int i, int j) {
		for (; i <= j; i++, j--) {
			char tempCharacter = word[j];
			word[j] = word[i];
			word[i] = tempCharacter;
		}
		return word;
	}
}