// You are given an integer array A of length N, where each element is between 2 and IO (inclusive).
// Count how many consecutive blocks of identical elements exist such that the length of the
// block is equal to the value of the element. Return an integer representing the count ot such
// blocks.
// Input Specification:
// • inputl: an integer N representing the size of the array.
// • input2: an integer array A.
// Output Specification:
// • Return an integer representing the count of blocks whose length equals their element
// value.
// Examples
// Example 1:
// inputl = 9
// input2 = {2, 2, 3, 3, 3, 4, 2, 2, 2}
// Outputl : 2


// import java.util.*;
public class CountBlocks {
    
    public static int countblock(int[] arr){

        int n = arr.length;
        int i = 0;
        int count = 0;

        while(i < n){
            int j = i;

            while(j < n && arr[i] == arr[j]){
                j++;
            }

            int len = j - i;

            if(arr[i] == len){
                count++;
            }

            i = j;
        }

        return count;
    
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 2, 3, 3, 3, 4, 2, 2, 2};
        System.out.println(countblock(arr));

    }

}
