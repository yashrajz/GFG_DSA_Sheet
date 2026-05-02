//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/reverse-the-circular-linked-list

public class ReverseTheCircularLinkedList {
    
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        if(head == null || head.next == head){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        do{
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }while(curr != head);

        head.next = prev; // connecting the last node to the new head

        return prev; // new head of the reversed list
    }
}
