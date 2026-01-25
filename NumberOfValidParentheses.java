//www.geeksforgeeks.org/problems/valid-number-of-parenthesis/1

public class NumberOfValidParentheses {
    int findWays(int n) {
        
        if (n % 2 == 1){
            return 0;
        }
        
        int k = n / 2;  
        long catalan = 1;
        
        // C_k = (1/(k+1)) * (2k choose k)
        // Compute binomial(2k, k) / (k+1)
        for (int i = 0; i < k; i++) {
            catalan *= (2 * k - i);
            catalan /= (i + 1);
        }
        
        catalan /= (k + 1);
        
        return (int)catalan;
    }
}
