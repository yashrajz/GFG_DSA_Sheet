public class MiddleOfALinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public int middleNode(Node head) {
        
        if(head == null|| head.next == null){
            return head.data;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
        
    }
}
