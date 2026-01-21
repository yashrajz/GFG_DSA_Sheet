//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week1/problem/inverse-division

public class InverseDivision {

    static int extendedGCD(int a, int b, int[] x, int[] y) {

        if (a == 0) {
            x[0] = 0;
            y[0] = 1;
            return b;
        }

        int[] x1 = new int[1];
        int[] y1 = new int[1];

        int gcd = extendedGCD(b % a, a, x1, y1);

        x[0] = y1[0] - (b / a) * x1[0];
        y[0] = x1[0];

        return gcd;
    }

    public int modDivide(int a, int b, int M) {

        a = a % M;   

        int[] x = new int[1];
        int[] y = new int[1];

        int gcd = extendedGCD(b, M, x, y);

        if (gcd != 1) {
            return -1;
        }

        int inverseB = (x[0] % M + M) % M;
        return (int)((1L * a * inverseB) % M);
    }
}