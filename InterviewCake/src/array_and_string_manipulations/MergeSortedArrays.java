package array_and_string_manipulations;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void main(String...strings) {
		  int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		  int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		  System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
	}
	
	public static int[] mergeArrays(int[] myArray, int[] alicesArray) {
		int []mergedArray = new int[myArray.length + alicesArray.length];
		int k = 0, i = 0, j = 0;
		while (i < myArray.length && j < alicesArray.length) {
			if (myArray[i] <= alicesArray[j]) {
				mergedArray[k++] = myArray[i];
				++i;
			} else if (myArray[i] > alicesArray[j]){
				mergedArray[k++] = alicesArray[j];
				++j;
			}
		}
		
		while (i < myArray.length) {
			mergedArray[k++] = myArray[i];
			++i;
		}
		
		while(j < alicesArray.length) {
			mergedArray[k++] = alicesArray[j];
			++j;
		}
		return mergedArray;
	}
}
