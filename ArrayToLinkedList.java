public class ArrayToLinkedList {

    class Node {
        int data;
        Node next;
        Node (int d) {
        data = d;
        next = null;
        }
    };


    public Node arrayToList(int arr[]) {
        
        Node head = new Node(arr[0]);
        Node temp = head;
        
        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
            
        }
        
        return head;
        
    }

}