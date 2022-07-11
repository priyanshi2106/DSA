/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while(even != null && even.next != null){
            // odd.next = even.next;
            // odd = odd.next;
            // even.next = odd.next;
            //even = even.next;
            
             odd.next = odd.next.next;
            
            // Put even to the even list
            even.next = even.next.next;
            
            // Move the pointer to the next odd/even
            odd = odd.next;
            even = even.next;
        }
        //connect both the linked list
        odd.next = evenHead;
        return head;
    }
}