//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/union-of-two-arrays3538

import java.util.*;
public class UnionOfArraysWithDuplicates {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
    
        Set<Integer> set = new HashSet<>();
        
        for (int num : a){
            set.add(num);
        } 
        for (int num : b){
            set.add(num);
        } 

        // Converting to ArrayList and sort
        ArrayList<Integer> result = new ArrayList<>(set);
        // Collections.sort(result);

        return result;
    }

}
