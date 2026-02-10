//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/linear-probing-in-hashing-1587115620

import java.util.ArrayList;

public class LinearProbingInHashing {

    public ArrayList<Integer> linearProbing(int[] arr, int m) {
        
        //creating table;
        ArrayList<Integer> hTable = new ArrayList<>();
        
        //initialize with -1
        for(int i = 0; i < m; i++){
            hTable.add(-1);
        }
        
        //Inserting element using linear probing.
        for(int key : arr){
            
            int idx = (key % m);      //kaunsa ele. kaha jayega.
            int startIdx = idx;    //kahi wapas ghoom kr wapas wahi to nhi aa gye
            
            while(hTable.get(idx) != -1 && hTable.get(idx) != key){  // agar wo jagah khali nhi hai to?
                idx = (idx + 1) % m;    //khali nhi to aage badhoo
                
                if(idx == startIdx){
                    break;              //ghoom kr wapas wahi aa gye.
                }
                
            }
            
            if(hTable.get(idx) == -1){  //khali hai, yaha dal do.
                hTable.set(idx, key);
                
            } 
        }
        
        
        return hTable;
        
        
        
        
    }
}
