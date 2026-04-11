public class RemoveNthNodeFromEndOfList {


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        //move the fast pointer to n postition;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        //edge condition when we have to delete head from last;
        if(fast == null){
            head = head.next;   //remove head;
            return head;
        }
        //now move both pointer 1 pos till fast.next reaches null;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //now remove the node.
        slow.next = slow.next.next;

        return head;
        
    }

}
