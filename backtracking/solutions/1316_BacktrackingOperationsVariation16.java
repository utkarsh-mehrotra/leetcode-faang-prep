class _1316_BacktrackingOperationsVariation16 {
    public boolean solve(String word, char[][] board) {
        // Generic Graph DFS Path Validator (Word Search subset)
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] b, int r, int c, int count, String w) {
        if (count == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] != w.charAt(count)) return false;
        char temp = b[r][c]; b[r][c] = '#';
        boolean found = dfs(b, r+1, c, count+1, w) || dfs(b, r-1, c, count+1, w)
                     || dfs(b, r, c+1, count+1, w) || dfs(b, r, c-1, count+1, w);
        b[r][c] = temp;
        return found;
    }
    public static void main(String[] args) {}
}
