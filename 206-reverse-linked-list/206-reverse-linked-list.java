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
    public ListNode reverseList(ListNode head) {
        
        // for 0 or 1 node
        if(head==null ||head.next==null)
        {
            return head;
        }
        // for more than 1 nodes
        ListNode curr=head;
        ListNode forward=head.next;
        while(forward!=null)
        {
            ListNode rem_nodes=forward.next;
            forward.next=curr;
            curr=forward;
            forward=rem_nodes;
            
        }
        head.next=null;
        head=curr;
        return head;
    }
}