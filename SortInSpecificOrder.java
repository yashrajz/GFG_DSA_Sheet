//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week5/problem/sort-in-specific-order2422

import java.util.Arrays;

public class SortInSpecificOrder {

    public void sortIt(int[] arr) {
        
        //arr contains positive no. so we multilpy odd with -1
        // why? because 7 -> -7, 5 -> -5, odd becomes small and 
        //comes foreward (left) after sorting. 
        // arr - -7, -5, -1, 2, 4, 6
        // then we make odd again positive
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                arr[i] *= -1;
            }
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == -1){
                arr[i] *= -1;
            }
        }
        
        
    }

}
