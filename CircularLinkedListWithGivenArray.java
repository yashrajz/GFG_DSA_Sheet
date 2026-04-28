//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/create-circular-linked-list-with-given-array

public class CircularLinkedListWithGivenArray {
    public static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    public static Node createCircularLinkedList(int[] arr){
        if(arr.length == 0){
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        temp.next = head; 

        return head;
    }

    public static void printCircularLinkedList(Node head){
        if(head == null){
            return;
        }

        Node temp = head.next;
        System.out.print(head.data + " " );

        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = createCircularLinkedList(arr);
        printCircularLinkedList(head);
    }
}
