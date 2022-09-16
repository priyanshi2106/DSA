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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int carry = 0;
        ListNode result = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode curr = result;
        while(p1 != null || p2 != null){
            int x = (p1!=null)?p1.val:0;
            int y = (p2!=null)?p2.val:0;
            int sum = carry+x+y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return result.next;
    }
}