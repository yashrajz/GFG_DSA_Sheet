//www.geeksforgeeks.org/problems/count-number-of-substrings4528/1

public class SubstringswithKDistinct {
    
    public int countSubstr(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    private int countAtMostK(String s, int k) {
        if (k < 0) return 0;

        int[] freq = new int[26]; // assuming lowercase letters
        int left = 0, count = 0, distinct = 0;

        for (int right = 0; right < s.length(); right++) {

            // add right character
            if (freq[s.charAt(right) - 'a'] == 0) {
                distinct++;
            }
            freq[s.charAt(right) - 'a']++;

            // shrink window if distinct > k
            while (distinct > k) {
                freq[s.charAt(left) - 'a']--;
                if (freq[s.charAt(left) - 'a'] == 0) {
                    distinct--;
                }
                left++;
            }

            // number of valid substrings ending at right
            count += right - left + 1;
        }

        return count;
    }
}
