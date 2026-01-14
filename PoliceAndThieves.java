//www.geeksforgeeks.org/problems/police-and-thieves--141631/1

public class PoliceAndThieves {
    public int catchThieves(char[] arr, int k) {
        
        int n = arr.length;
        int p = 0;
        int t = 0;
        int caughtCount = 0;

        while (p < n && t < n) {
            // Find the next policeman
            if (arr[p] != 'P') {
                p++;
                continue;
            }
            // Find the next thief
            if (arr[t] != 'T') {
                t++;
                continue;
            }

            // If found both, check distance
            if (Math.abs(p - t) <= k) {
                caughtCount++;
                p++;
                t++;
            } else if (t < p) {
                t++;
            } else {
                p++;
            }
        }
        return caughtCount;
    }
}
