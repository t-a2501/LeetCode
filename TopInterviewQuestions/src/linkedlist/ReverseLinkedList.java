package linkedlist;

//Reverse a singly linked list.
//
//Example:
//
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
//Follow up:
//
//A linked list can be reversed either iteratively or recursively. Could you implement both?

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tmp1 = head;
        ListNode tmp2 = tmp1.next;

        head.next = null;
        while(tmp1 != null && tmp2 != null){
            ListNode tmp3 = tmp2.next;
            tmp2.next = tmp1;
            tmp1 = tmp2;
            tmp2 = tmp3;
        }

        return tmp1;
    }
}
