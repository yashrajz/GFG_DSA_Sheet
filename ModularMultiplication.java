//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/modular-multiplication

public class ModularMultiplication {
    
    public int modmul(int a, int b, int M) {
        
        int ans = ((a % M) * (b % M)) % M;
        
        
        return ans;
    }
}
