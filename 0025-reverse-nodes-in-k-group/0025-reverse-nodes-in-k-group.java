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
    public ListNode reverseKGroup(ListNode head, int k) {
        //base case
        if(head==null || k==1){
            return head;
        }
        //step1-calculate size of ll
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        //step2-create dummy node and assign parameters
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy , curr=dummy , nxt=dummy;
          //step3- assign curr & nxt;
        while(count>=k){ //8-5-2 for k=3
            curr=prev.next;
        nxt=curr.next;
        for(int i=1;i<k ; i++){
            curr.next=nxt.next;
            nxt.next=prev.next;
            prev.next=nxt;
            nxt=curr.next;
        }
            prev=curr;
            count-=k;

    }
    return dummy.next;
   


        
        
    }
}