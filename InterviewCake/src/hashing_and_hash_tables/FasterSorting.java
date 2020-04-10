
package hashing_and_hash_tables;

public class FasterSorting
{
    public static void main(final String... strings) {
        final int[] unorderedScores = { 20, 10, 30, 30, 10, 20 };
        System.out.println(sortScores(unorderedScores, 100));
        int[] array;
        for (int length = (array = unorderedScores).length, j = 0; j < length; ++j) {
            final int i = array[j];
            System.out.println(i);
        }
    }
    
    public static int[] sortScores(final int[] unorderedScores, final int highestPossibleScore) {
        final int[] highestPossibleArray = new int[highestPossibleScore + 1];
        int kIndex = 0;
        for (int i = 0; i < unorderedScores.length; ++i) {
            ++highestPossibleArray[unorderedScores[i]];
        }
        for (int i = highestPossibleArray.length - 1; i >= 0; --i) {
            if (highestPossibleArray[i] != 0) {
                while (highestPossibleArray[i] != 0) {
                    highestPossibleArray[unorderedScores[kIndex++] = i] = highestPossibleArray[i] - 1;
                }
            }
        }
        return unorderedScores;
    }
}