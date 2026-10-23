// Problem 1: Compress Consecutive Characters Problem Statement You are given a string S consisting of lowercase English letters. Your task is to compress the string by replacing each group of consecutive identical characters with the character followed by its frequency. 
// • If a character appears only once consecutively, print only the character without the frequency.  • The order of characters in the output must remain the same as in the original string.  
// Input Format • A single string S.  
// Output Format • Print the compressed string.  
// Constraints 1 ≤ |S| ≤ 10^5 S contains only lowercase English letters ('a' to 'z'). 

import java.util.*;

public class StringCompression {
    public static String compressString(String s) {

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(s.charAt(n - 1));
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String compressedString = compressString(str);
        System.out.println(compressedString);


        sc.close();

    }
}
