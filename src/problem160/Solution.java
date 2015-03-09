//Intersection of Two Linked Lists
package problem160;

public class Solution {
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = length(headA);
		int lengthB = length(headB);
		if (lengthA > lengthB) {
			for (int i = 0; i < lengthA - lengthB; i++) {
				headA = headA.next;
			}
		} else if (lengthB > lengthA) {
			for (int i = 0; i < lengthB - lengthA; i++) {
				headB = headB.next;
			}
		}
		if (headA == null || headB == null) {
			return null;
		}
		do {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		} while (headA != null && headB != null);
		return null;
	}

	public int length(ListNode head) {
		if (head == null) {
			return 0;
		}
		int count = 0;
		do {
			count++;
			head = head.next;
		} while (head != null);
		return count;
	}
}
