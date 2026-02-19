//www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/non-repeating-character-1587115620

import java.util.HashMap;

public class NonRepeatingCharacter {
    
    public char NonRepeatingChar(String s){

        HashMap<Character, Integer> hm = new HashMap<>();

        //counting freq of each char;
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        //checking the non repeating char;
        for(char ch : s.toCharArray()){
            if(hm.get(ch) == 1){
                return ch;
            }
        }

        return '$';

    }
}
