import java.util.ArrayList;

public class InsertInterval {

    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        
        int i = 0;
        int n = intervals.length;
        
        ArrayList<int[]> res = new ArrayList<>();
        
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i++]);
        }
        
        int st = newInterval[0];
        int en = newInterval[1];
        
        while (i < n && intervals[i][0] <= en) {
            st = Math.min(st, intervals[i][0]);
            en = Math.max(en, intervals[i][1]);
            i++;
        }
        
        res.add(new int[]{st, en});
        
        while (i < n){
            res.add(intervals[i++]);
        }
        
        return res;
    }

}
