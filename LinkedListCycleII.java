// 3.Linked List Cycle II Given the head of a linked list, return the node where the cycle begins. 
// If there is no cycle, return null. 
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). 
// It is -1 if there is no cycle. Note that pos is not passed as a parameter. Do not modify the linked list. 



public class LinkedListCycleII {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
}

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(head == null || head.next == null){
            return null;
        }

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }
        
        ListNode temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = n2;

        ListNode cycle = detectCycle(head);

         if (cycle != null) {

            int index = 0;
            ListNode temp = head;

            while (temp != cycle) {
                temp = temp.next;
                index++;
            }

            System.out.println("tail connects to node index " + index);

        } 
        else {
            System.out.println("no cycle");
        }
    }

}