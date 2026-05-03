//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/reverse-a-linked-list

public class ReverseALinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
