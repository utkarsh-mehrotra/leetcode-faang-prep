import java.util.*;
class _1314_BacktrackingOperationsVariation14 {
    public List<List<String>> solve(int n) {
        // N-Queens II (count/return strings) -- generic template
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) Arrays.fill(board[i], '.');
        backtrack(res, board, 0);
        return res;
    }
    private void backtrack(List<List<String>> res, char[][] board, int refRow) {
        if(refRow == board.length) {
            List<String> list = new ArrayList<>();
            for(char[] r : board) list.add(new String(r));
            res.add(list);
            return;
        }
        for(int c=0; c<board.length; c++) {
            if(isValid(board, refRow, c)) {
                board[refRow][c] = 'Q';
                backtrack(res, board, refRow+1);
                board[refRow][c] = '.';
            }
        }
    }
    private boolean isValid(char[][] board, int row, int col) {
        for(int i=0; i<row; i++) if(board[i][col] == 'Q') return false;
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) if(board[i][j] == 'Q') return false;
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) if(board[i][j] == 'Q') return false;
        return true;
    }
    public static void main(String[] args) {}
}
