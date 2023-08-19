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
       
        ListNode head1=reverse(l1);
       
        ListNode head2=reverse(l2);


        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int carry=0;
        while(head1!=null || head2!=null || carry==1){
            int sum=0;
            if(head1!=null){
                sum+=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.val;
                head2=head2.next;

            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        ListNode head=reverse(dummy.next);
        return head;
         }
    public ListNode reverse(ListNode l1){
        ListNode prev1=null;
        ListNode curr1=l1;
        ListNode next1;
        while(curr1!=null){
            next1=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next1;
        }
        
        return prev1;

    }

}