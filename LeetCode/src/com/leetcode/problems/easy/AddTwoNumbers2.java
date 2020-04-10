package com.leetcode.problems.easy;


//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order 
//and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Example:

//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

public class AddTwoNumbers2 {
	public static void main(String...strings) {
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode l3 = null;
        ListNode temp = null;
        
        int sumOfNode = 0, carryResult = 0;
		
        while (l1 != null && l2 != null) {
			
        	sumOfNode = l1.val + l2.val + carryResult;
			if (sumOfNode >= 10) {
				carryResult = 1;
			} else {
				carryResult = 0;
			}
			
			ListNode list = new ListNode(sumOfNode%10);
			
			if (l3 != null) {
				temp.next = list;
                temp = temp.next;
			} else {
				l3 = list;
                temp = l3;
			}
		
			l1 = l1.next;		l2 = l2.next;
		} 
        
		while(l1 != null) {
            
            sumOfNode = l1.val + carryResult;
            
			if (sumOfNode >= 10) {
				carryResult = 1;
			} else {
				carryResult = 0;
			}
			
			ListNode list = new ListNode(sumOfNode%10);
        
            l1 = l1.next;
            temp.next = list;
            temp = temp.next;
        }
        
        while(l2 != null) {
            sumOfNode = l2.val + carryResult;
            
			if (sumOfNode >= 10) {
				carryResult = 1;
			} else {
				carryResult = 0;
			}
			
			ListNode list = new ListNode(sumOfNode%10);
            
            l2 = l2.next;
            temp.next = list;
            temp = temp.next;
        }
        
        if (l1 == null && l2 == null && carryResult != 0){
            ListNode list = new ListNode(carryResult);
            temp.next = list;
        }
        
		return l3;
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}