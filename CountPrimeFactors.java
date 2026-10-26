// You are running a diagnostics module that processes a number by trimming its digits step-by-
// step and collecting its prime factors. Starting with a number num, do the following until the
// number becomes O.
// In each step, factorize the current number and collect its prime factors in
// a global set. 
// If it's an odd-numbered step (1 St. 3rd. etc.), remove the first digit of the number.
// If it's an even-numbered step (2nd. 4th, etc.), remove the last digit of the number. 
// Your task is to find and return an integer value representing the count of unique prime factors
//  collected duringthis entire process.
// Input Specification:
// inputl : An integer num representing the numeric code.
// Output Specification:
// Return an integer value representing the count of unique prime factors collected during this
// entire process.
// Example 1:
// inputl : 14562
// output 1 : 7

import java.util.*;
public class CountPrimeFactors {

    public static boolean isPrime(int n){
        if(n < 2) return false;

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static int countPrimes(int num){
        
        Set<Integer> prime = new HashSet<>();
        int step = 1;

        // converted into string for easier removal of digits;
        String str = String.valueOf(num);

        while(!str.isEmpty()){
            int n = Integer.parseInt(str);
            
            //finding the prime factors of n;
            for(int i = 2; i <= n; i++){
                if(n % i == 0 && isPrime(i)){
                    prime.add(i);
                }
            }

            //odd step;
            if(step % 2 != 0){
                str = str.substring(1);
            }
            else{
                str = str.substring(0, str.length() - 1);
            }

            step++;

        }

        return prime.size();

    }

    public static void main(String[] args) {
        System.out.println(CountPrimeFactors.countPrimes(14562));
    }
}
