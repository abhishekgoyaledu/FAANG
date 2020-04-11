package com.sorting.problems;

public class SelectionSort {
	public static void main(String[] args) {
		int []intArray = new int[] {914, 826, 793, 617, 577, 431, 344, 255, 120};
		
		//selection sort logic --> Time complexity ~ O(n2)
		int i = 0, j = 0, k = 0;
		for (; i < intArray.length; i++) {
		
			for (k = i+1; k < intArray.length; ++k) {
				if (intArray[j] > intArray[k]) {
					j = k;
				}
			}
			int temp = intArray[i];
			intArray[i] = intArray[j];
			intArray[j] = temp;
			j = i+1;
		}
		
		for (int value : intArray) {
			System.out.println(value);
		}
	}
}
