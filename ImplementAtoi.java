//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week4/problem/implement-atoi

public class ImplementAtoi {

    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;

        // skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;

        // handle optional sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }

}
