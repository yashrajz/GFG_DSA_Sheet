//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/modular-exponentiation-for-large-numbers5537

public class ModularExponentiation {

    public int powMod(int x, int n, int M) {
        
        long res = 1;
        long base = x;
        
        while(n >= 1){
            
            if((n & 1) == 1){   // n (power) is odd
                res = (res * base) % M;
                n--;
            }
            else{               // n is even
                base = (base * base) % M;
                n = n / 2;
            }
        }
        
        return (int)res;
    }
}
