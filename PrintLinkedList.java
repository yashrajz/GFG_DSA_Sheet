import java.util.*;

public class PrintLinkedList {

    class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    };

    public ArrayList<Integer> printList(Node head) {
        
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
            
        }
        
        return arr;
        
        
    }
}
