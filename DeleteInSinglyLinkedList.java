public class DeleteInSinglyLinkedList {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public Node deleteNode(Node head, int x) {
        
        if(head == null){
            return null;
        }
        
        if(x == 1){
            return head.next;
        }
        
        Node temp = head;
        
        for(int i = 1; i < x - 1; i++){
            if(temp.next != null){
                temp = temp.next;
            } else {
                return head;
            }
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        
        return head;
    }
}
