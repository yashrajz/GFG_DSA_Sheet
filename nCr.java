public class nCr {
    public int combination(int n, int r){

        double sum = 1;
        for(int i = 1; i <= r; i++){
            sum = sum * (n - r + i) / i;
        }

        return (int)sum;
    }
}
