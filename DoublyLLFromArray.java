//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/create-a-doubly-linked-list-from-a-given-array
public class DoublyLLFromArray {
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

    public static Node createDLLFromArray(int[] arr){
        if(arr.length == 0){
            return null;
        }

        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            curr.next = temp;
            temp.prev = curr;
            curr = temp;
        }

        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = createDLLFromArray(arr);
        printDLL(head);
    }
}
