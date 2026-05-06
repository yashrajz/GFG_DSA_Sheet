public class RotatingTheBox {

    public char[][] rotateTheBox(char[][] boxGrid) {
        
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;
        
        char[][] res = new char[cols][rows];
        
        // fill result with '.'
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                res[i][j] = '.';
            }
        }
        
        // process each row
        for (int r = 0; r < rows; r++) {
            
            int p = cols - 1; // position for next stone
            
            for (int c = cols - 1; c >= 0; c--) {
                
                if (boxGrid[r][c] == '*') {
                    // place obstacle directly
                    res[c][rows - 1 - r] = '*';
                    p = c - 1; // reset pointer
                }
                
                else if (boxGrid[r][c] == '#') {
                    // place stone at correct rotated position
                    res[p][rows - 1 - r] = '#';
                    p--;
                }
            }
        }
        
        return res;
    }
}