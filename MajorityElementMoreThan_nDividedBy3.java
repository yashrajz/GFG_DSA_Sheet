//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

import java.util.ArrayList;
import java.util.Collections;

public class MajorityElementMoreThan_nDividedBy3 {
    public ArrayList<Integer> findMajority(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n == 0){
            return list;
        }
        
        // Boyer - Moore voting Technique
        int cand1 = -1;
        int cand2 = -1;
        int count1 = 0;
        int count2 = 0;
        
        for(int num : arr){
            if(num == cand1){
                count1++;
            }
            else if(num == cand2){
                count2++;
            }
            else if(count1 == 0){
                cand1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                cand2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        //Verifying the candidate by actual number of count
        count1 = 0;
        count2 = 0;
        
        for(int num : arr){
            if(num == cand1){
                count1++;
            }
            else if(num == cand2){
                count2++;
            }
        }
        
        //Adding the res to the ArrayList
        if(count1 > n/3){
            list.add(cand1);
        }
        
        if(count2 > n/3){
            list.add(cand2);
        }
        
        Collections.sort(list);
        
        return list;
        
        
    }
}
