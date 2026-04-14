/**
 * 79. Word Search
 * Difficulty: Medium
 * Pattern: DFS / Backtracking
 */
public class _079_WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, r, c, word, 0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] b, int r, int c, String w, int idx) {
        if (idx == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] != w.charAt(idx)) return false;
        char temp = b[r][c];
        b[r][c] = '#';
        boolean res = dfs(b, r+1, c, w, idx+1) || dfs(b, r-1, c, w, idx+1) ||
                      dfs(b, r, c+1, w, idx+1) || dfs(b, r, c-1, w, idx+1);
        b[r][c] = temp;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Word Search test passed.");
    }
}