//www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/anagram-1587115620

import java.util.HashMap;

public class Anagram {
   
    public static boolean areAnagrams(String s1, String s2) {
        
        //checking the length of both string
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        //freq counting +1 in hashMap
        for(char ch : s1.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        //freq counting -1 in hashMap
        for(char ch : s2.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) - 1);
        }

        for(int val : hm.values()){
            if(val != 0){
                return false;
            }
        }
        
        return true;
    }
}
