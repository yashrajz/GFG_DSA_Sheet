//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/isomorphic-strings-1587115620

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean areIsomorphic(String s1, String s2) {
        
        //solving using 2 HashMap;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            //if char is not in map1, put it in map
            if(!m1.containsKey(c1)){
                m1.put(c1, i);
            }
            
            //if char is not in map2, put it in map
            if(!m2.containsKey(c2)){
                m2.put(c2, i);
            }
            
            //checking the mapping.
            if(!m1.get(c1).equals(m2.get(c2))){
                return false;
            }
        }
        return true;
    }
}
