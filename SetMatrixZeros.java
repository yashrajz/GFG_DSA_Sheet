//www.geeksforgeeks.org/problems/set-matrix-zeroes/1
//leetcode.com/problems/set-matrix-zeroes/description/

public class SetMatrixZeros {
    
    public void setZeroes(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        //ckecking if first Rol has Zero?
        for(int j = 0; j < n; j++){
            if(mat[0][j] == 0){
                firstRowHasZero = true;
                break;
            }
        }
        // /ckecking if first col has Zero?
        for(int i = 0; i < m; i++){
            if(mat[i][0] == 0){
                firstColHasZero = true;
                break;
            }
        }

        //checking for other elements (1, m - 1) --> (1, n - 1) & marking them for zero;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(mat[i][j] == 0){
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        //If element has zero, Actually setting them to zero
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }

        //Setting first row/col to zero;
        if(firstRowHasZero){
            for(int j = 0; j < n; j++){
                mat[0][j] = 0;
            }
        }

        //Setting first Col/Row to zero;
        if(firstColHasZero){
            for(int i = 0; i < m; i++){
                mat[i][0] = 0;
            }
        }

    }

    
}
