public class RotateALinkedList {
    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node rotate(Node head, int k) {
        
        Node temp = head;
        int len = 1;
        
        //base case.
        if(k == 0 || head == null){
            return head;
        }
        
        //finding length;
        while(temp.next != null){
            temp = temp.next;
            len = len + 1;
        }
        
        //if k > len, trim it;
        k = k % len;
        
        //after triming if k == 0, return head;
        if(k == 0) return head;
        
        //else make it circular
        temp.next = head; // making it a circular LL
        temp = head;     // moving to head;
        
        //find the kth ele.
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }
        
        //break the circular loop;
        head = temp.next;  // new head is k + 1 ele.
        temp.next = null;  // break the loop and make it singly again;
        
        
        return head;
        
        
    }
}
