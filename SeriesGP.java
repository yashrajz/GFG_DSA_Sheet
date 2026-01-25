//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/series-gp4646

public class SeriesGP {
    public int nthTerm(int a, int r, int n){
        
        int Mod = 1000000007;
        long res = a;

        for(int i = 1; i < n; i++){
            res = (res * r) % Mod;
        }
        
        return (int)res;
    }
}
