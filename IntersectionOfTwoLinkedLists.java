//leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.lang.*;
import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.*;

public class IntersectionOfTwoLinkedLists {

    @SuppressWarnings("preview")
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = 0, s2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        //  calculating the sizes;
        while(temp1 != null){
            s1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            s2++;
            temp2 = temp2.next;
        }

        //resetting the temp's to head's;
        temp1 = headA;
        temp2 = headB;

        int n = s1 - s2;
        
        //now move the temp of bigger LL to n pos;
        for(int i = 0; i < Math.abs(n); i++){
            if(n > 0){
                temp1 = temp1.next;
            }
            else{
                temp2 = temp2.next;
            }
        }

        //now check if temp1 == temp2 or not.
        while(temp1 != null){
            if(temp1 == temp2){
                return temp1;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }

}
