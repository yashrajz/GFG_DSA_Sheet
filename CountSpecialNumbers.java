//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/count-special-numbers--170647

public class CountSpecialNumbers {
    public int cntSpecialNum(int arr[]) {
        int n = arr.length;
        if (n <= 1) return 0;
        
        int max = 0;
        for (int x : arr) max = Math.max(max, x);
        
        int[] freq = new int[max + 1];
        for (int x : arr) freq[x]++;
        
        int[] hasOtherDivisor = new int[max + 1];
        
        // For each possible divisor
        for (int d = 1; d <= max; d++) {
            if (freq[d] == 0) continue;
            
            // Mark all its multiples (except itself)
            for (long mul = (long) d * 2; mul <= max; mul += d) {
                if (freq[(int)mul] > 0) {
                    hasOtherDivisor[(int)mul] = 1;
                }
            }
        }
        
        int count = 0;
        for (int x : arr) {
            // Special if has other divisor OR appears more than once
            if (hasOtherDivisor[x] == 1 || freq[x] >= 2) {
                count++;
            }
        }
        
        return count;
    }
}