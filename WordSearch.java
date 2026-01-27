//www.geeksforgeeks.org/problems/word-search/1

public class WordSearch {

    public boolean isWordExist(char[][] mat, String word) {
        if (mat == null || mat.length == 0 || mat[0].length == 0 || word.isEmpty()) {
            return false;
        }
        
        int m = mat.length;        // rows
        int n = mat[0].length;     // columns
        
        // Try starting from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(mat, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // DFS helper: check if we can form the word starting from (row, col) with index in word
    private boolean dfs(char[][] mat, String word, int row, int col, int index) {
        // Base case: successfully matched the entire word
        if (index == word.length()) {
            return true;
        }
        
        // Out of bounds or character doesn't match or already visited
        if (row < 0 || row >= mat.length || 
            col < 0 || col >= mat[0].length || 
            mat[row][col] != word.charAt(index)) {
            return false;
        }
        
        // Mark current cell as visited (by changing to some temp char)
        char temp = mat[row][col];
        mat[row][col] = '#';  // mark as visited
        
        // Try all 4 directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            
            if (dfs(mat, word, newRow, newCol, index + 1)) {
                return true;
            }
        }
        
        // Backtrack: restore original character
        mat[row][col] = temp;
        
        return false;
    }
    
}
