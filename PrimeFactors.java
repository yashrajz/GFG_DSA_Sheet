//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/prime-factors5052

import java.util.*;

public class PrimeFactors {

    public static ArrayList<Integer> primeFac(int n) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                res.add(i);
            }
            
            while(n % i == 0){
                n /= i;
            }
        }
        
        if(n > 1){
            res.add(n);
        }
        
        return res;
    }
}
