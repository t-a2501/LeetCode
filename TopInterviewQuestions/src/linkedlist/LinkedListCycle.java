package linkedlist;

//Given a linked list, determine if it has a cycle in it.
//
//To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
//
//
//
//Example 1:
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
//
//
//Example 2:
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the first node.
//
//
//Example 3:
//
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.

public class LinkedListCycle {
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }

	 public boolean hasCycle(ListNode head) {
       ListNode node1 = head;
       ListNode node2 = head;

       while(node1 != null && node1.next != null) {
            node2 = node2.next;
            node1 = node1.next.next;

            if(node2 == node1){
                return true;
            }
        }
        return false;
    }
}
