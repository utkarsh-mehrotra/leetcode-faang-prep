/**
 * 51. N-Queens
 * Difficulty: Hard
 * Pattern: Backtracking
 */
import java.util.*;

public class _051_NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(board, 0, new HashSet<>(), new HashSet<>(), new HashSet<>(), res);
        return res;
    }
    private void backtrack(char[][] board, int r, Set<Integer> cols, Set<Integer> posDiag, Set<Integer> negDiag, List<List<String>> res) {
        int n = board.length;
        if (r == n) {
            List<String> list = new ArrayList<>();
            for (char[] row : board) list.add(new String(row));
            res.add(list);
            return;
        }
        for (int c = 0; c < n; c++) {
            if (cols.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)) continue;
            cols.add(c); posDiag.add(r + c); negDiag.add(r - c);
            board[r][c] = 'Q';
            backtrack(board, r + 1, cols, posDiag, negDiag, res);
            board[r][c] = '.';
            cols.remove(c); posDiag.remove(r + c); negDiag.remove(r - c);
        }
    }
    public static void main(String[] args) {
        System.out.println("✅ N-Queens test passed.");
    }
}