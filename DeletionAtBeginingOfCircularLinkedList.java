public class DeletionAtBeginingOfCircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node deleteNode(Node head, int key) {
        
        if(head == null) return null;
        
        if(head.next == head){
            if(head.data == key){
                return null;
            } 
            else{
                return head;
            }
        }
        
        Node temp = head;
        //for only 1 node;
         if(temp.data == key){
            
            while(temp.next != head){
                temp = temp.next;
            }
            
            temp.next = head.next;
            head = head.next;
            
            return head;
         }
        
        //for more than 2 nodes;
        temp = head;
        
        while(temp.next != head && temp.next.data != key){
            temp = temp.next;
        }
        
        if(temp.next.data == key)
            temp.next = temp.next.next;
        
        return head;
        
        
        
        
        
    }
}
