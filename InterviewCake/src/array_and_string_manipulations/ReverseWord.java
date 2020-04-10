package array_and_string_manipulations;

//char[] message = { 'c', 'a', 'k', 'e', ' ',
//                   'p', 'o', 'u', 'n', 'd', ' ',
//                   's', 't', 'e', 'a', 'l' };
//
//reverseWords(message);
//
//System.out.println(message);
//prints: "steal pound cake"

public class ReverseWord {
	
	final static char SPACE = ' ';
	
	public static void main(String... strings) {
		char[] message = {'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };
		reverseWords(message);
		System.out.println(message);
	}
	
	public static void reverseWords(char[] message) {
        reverseString(message, 0, message.length-1);
    	int spaceIndex = 0;
    	int startIndex = 0;
    	for (int i = 0; i < message.length; ++i) {
    		if (message[i] == SPACE) {
    			spaceIndex = i;
    			reverseString(message, startIndex, spaceIndex-1);
    			startIndex = spaceIndex + 1;
    		}
    	}
    	reverseString(message, startIndex, message.length-1);
    }
    
    public static void reverseString(char []word, int i, int j) {
		for (; i <= j; i++, j--) {
			char tempCharacter = word[j];
			word[j] = word[i];
			word[i] = tempCharacter;
		}
	}
}
