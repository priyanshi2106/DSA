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
    public ListNode removeElements(ListNode head, int val) {
//        ListNode result = new ListNode(-1);
//         result.next = head;
//         ListNode prev = result;
       
        
       
//         ListNode curr = head;
//         while(curr != null){
//             if(curr.val == val){
//                 prev.next = curr.next;
                
//             }
//             else{
//                 prev = curr;
//             }
           
               
//             curr = curr.next; 
         
            
           
//         }
//         return result.next;
        
        // recursion
        if(head == null){
            return null;
        }
            head.next = removeElements(head.next, val);
            return (head.val == val)? head.next :head;
        
    }
}