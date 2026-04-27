public class DeleteInDoubleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }


    public Node delPos(Node head, int x) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        //remove from head;
        if(x == 1){
            head = head.next;
            head.prev = null;
            
            return head;
        }
        
        Node temp = head;
        for(int i = 1; i < x && temp != null; i++){
            temp = temp.next;
        }
        
        temp.prev.next = temp.next;
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        
        
        return head;
        
        
        
    }

}