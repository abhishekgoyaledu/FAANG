package com.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
		
		
public class TwoSum1 {
	
	public static void main(String...strings) {
		int []array = new int[] {2, 17, 7, 15};
		int target = 9;
		System.out.println(new TwoSum1().twoSum(array, target));
	}
	
	public int[] twoSum(int[] nums, int target) {
		
		int i = 0, j = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (; i < nums.length; ++i) {
			if (map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i) {
				j = i;
				i = map.get(target-nums[i]);
				break;
			}
			
			map.put(nums[i],  i);
		}
		System.out.println(i + "----" + j);
		return new int[] {i,j};
    }
}
