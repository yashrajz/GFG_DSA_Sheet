//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week8/problem/flattening-a-linked-list

import java.util.*;

public class FlattenLinkedList {
    
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }

    public Node flatten(Node root) {
        
        // create an array, store all value, sort it and create new
        // LinkedList out of it
        
        List<Integer> li = new ArrayList<>();
        
        while(root != null){
            
            li.add(root.data);
            
            Node temp = root.bottom;
            while(temp != null){
                li.add(temp.data);
                temp = temp.bottom;
            }
            
            root = root.next;
            
        }
        
        //sorting part;
        Collections.sort(li);
        
        //now creating a new Linked List;
        Node head = new Node(-1);
        Node curr = head;
        
        for(int num : li){
            curr.bottom = new Node(num);
            curr = curr.bottom;
        }
        
        return head.bottom;
        
        
        
    }

}