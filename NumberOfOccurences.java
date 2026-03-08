//www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/number-of-occurrence2259

public class NumberOfOccurences {

    int countFreq(int[] arr, int target) {
        
        int count = 0;
        
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        
        return count;
    }

}
