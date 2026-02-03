//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/frequency-of-elements--111353


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        HashMap <Integer,Integer> hm = new HashMap<>();
        
        //Counting frequency
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        //putting in thr ArrayList;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            //creating pair list
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            
            res.add(pair);
        }
        
        return res;
        
    }
}

