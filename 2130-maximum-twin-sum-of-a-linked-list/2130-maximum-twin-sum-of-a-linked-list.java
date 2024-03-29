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
    private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
    public int pairSum(ListNode head) {
        
        int ans = 0;
    ListNode slow = head;
    ListNode fast = head;

    // let slow point to the start of the second half
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // tail points to the end with reversed second half
    ListNode tail = reverseList(slow);

    while (tail != null) {
      ans = Math.max(ans, head.val + tail.val);
      head = head.next;
      tail = tail.next;
    }

    return ans;
    }
}