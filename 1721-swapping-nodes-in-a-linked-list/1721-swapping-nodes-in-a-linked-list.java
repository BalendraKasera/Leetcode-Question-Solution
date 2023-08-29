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
    public ListNode swapNodes(ListNode head, int k) {
     
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast k-1 steps ahead
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        
        ListNode firstNode = fast;
        
        // Move fast to the end, maintaining the kth gap
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode secondNode = slow;
        
        // Swap the values of the nodes
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
        
        return head;
    }
}


    