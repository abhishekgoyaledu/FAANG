package com.leetcode.problems.easy;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.

//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

//You may assume nums1 and nums2 cannot be both empty.

//Example 1:

//nums1 = [1, 2]
//nums2 = [3, 4]

//The median is 2.0

public class MedianOfTwoSortedArrays4 {
	public static void main(String...strings) {
		int []nums1 = new int[] {1, 2, 5, 7, 8, 10};
		int []nums2 = new int[] {};
		System.out.println(new MedianOfTwoSortedArrays4().findMedianSortedArrays(nums1, nums2));
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		double medianOne = 0.0;
		double medianTwo = 0.0;
		
		if (nums1.length < 1 || nums2.length < 1) {
			
			if (nums1.length > 1) {
				return getMedianValue(nums1);	
			}
			if (nums2.length > 1) {
				return getMedianValue(nums2);
			}
		} else {
			medianOne = getMedianValue(nums1);
			medianTwo = getMedianValue(nums2);
		}
		return (medianOne + medianTwo) / 2;
    }
	
	public double getMedianValue(int[] nums) {
		
		if (nums.length == 2) {
			return new Double(nums[0]+nums[1])/2;
		} else if (nums.length == 1){
			return nums[0];
		} 
		
		int median = nums.length / 2;
		double result ;
		if (median % 2 != 0) {
			result = nums[median-1];
		} else {
			result = new Double((nums[median-1] + nums[median]) / 2);
		}
		return result;
	}
}
