import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervals {

    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        
        //sorting the array
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> res = new ArrayList<>();

        int[] current = arr[0];

        for(int i = 1; i < arr.length; i++){
            int[] next = arr[i];

            if(current[1] > next[0]){
                
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                res.add(current);
                current = next;
            }
            
        }

        res.add(current);

        return res;
    
    }
}
