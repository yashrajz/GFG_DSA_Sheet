//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week4/problem/toggle-case

public class ToggleCase {
    
    public String toggleCase(String s) {
        
        String res = "";
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                res += Character.toLowerCase(ch);
            }
            else{
                res += Character.toUpperCase(ch);
            }
        }
        
        return res;
    }

}


