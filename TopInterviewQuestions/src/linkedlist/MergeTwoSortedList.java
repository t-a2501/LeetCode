package linkedlist;

//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
//Example:
//
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

public class MergeTwoSortedList {

	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ln = result;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ln.next = l1;
                l1 = l1.next;
            }else{
                ln.next = l2;
                l2 = l2.next;
            }
            ln = ln.next;
        }

        if(l1 != null){
            ln.next = l1;
        }

        if(l2 != null){
            ln.next = l2;
        }

        return result.next;
    }
}
