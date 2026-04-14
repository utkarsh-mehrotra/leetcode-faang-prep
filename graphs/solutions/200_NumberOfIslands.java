/**
 * 200. Number of Islands
 *
 * Difficulty   : Medium
 * Pattern      : DFS / BFS (Grid)
 * Acceptance   : 54.2%
 * Time         : O(M × N)
 * Space        : O(M × N)  — recursion stack (DFS) or queue (BFS)
 * Companies    : Google, Amazon, Meta, Microsoft, Apple
 * Frequency    : ★ 98 / 100  (FAANG 2023–2026)
 *
 * Problem
 * -------
 * Given an m × n 2D binary grid where '1' = land and '0' = water,
 * return the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent
 * lands horizontally or vertically.
 *
 * Example 1:
 *   grid = {{"1","1","1","1","0"},
 *            {"1","1","0","1","0"},
 *            {"1","1","0","0","0"},
 *            {"0","0","0","0","0"}}
 *   Output: 1
 *
 * Example 2:
 *   grid = {{"1","1","0","0","0"},
 *            {"1","1","0","0","0"},
 *            {"0","0","1","0","0"},
 *            {"0","0","0","1","1"}}
 *   Output: 3
 */
import java.util.ArrayDeque;
import java.util.Deque;

class _200_NumberOfIslands {

    // ── Approach 1: DFS (recursive, in-place marking) ─────────────────────────
    // Mark visited cells as '#' to avoid an extra visited array.
    public int numIslandsDFS(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length, count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c, rows, cols);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c, int rows, int cols) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] != '1') return;
        grid[r][c] = '#';           // mark visited in-place
        dfs(grid, r + 1, c, rows, cols);
        dfs(grid, r - 1, c, rows, cols);
        dfs(grid, r, c + 1, rows, cols);
        dfs(grid, r, c - 1, rows, cols);
    }

    // ── Approach 2: BFS (iterative, same in-place trick) ──────────────────────
    private static final int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};

    public int numIslandsBFS(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length, count = 0;
        Deque<int[]> queue = new ArrayDeque<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    grid[r][c] = '#';
                    queue.offer(new int[]{r, c});
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        for (int[] d : DIRS) {
                            int nr = cell[0] + d[0], nc = cell[1] + d[1];
                            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                                    && grid[nr][nc] == '1') {
                                grid[nr][nc] = '#';
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }

    // ── Tests ──────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        _200_NumberOfIslands sol = new _200_NumberOfIslands();

        Object[][] cases = {
            // {grid (deep-copied for each approach), expected}
            new Object[]{new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}, 1},
            new Object[]{new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}, 3},
            new Object[]{new char[][]{{'1'}}, 1},
            new Object[]{new char[][]{{'0'}}, 0},
        };

        for (Object[] tc : cases) {
            char[][] grid = (char[][]) tc[0];
            int expected  = (int) tc[1];

            // Deep-copy grid for each approach (in-place marking mutates it)
            char[][] gridDFS = deepCopy(grid);
            char[][] gridBFS = deepCopy(grid);

            int dfsResult = sol.numIslandsDFS(gridDFS);
            int bfsResult = sol.numIslandsBFS(gridBFS);
            boolean ok    = dfsResult == expected && bfsResult == expected;
            System.out.printf("%s  expected=%-2d  dfs=%-2d  bfs=%-2d%n",
                              ok ? "✅" : "❌", expected, dfsResult, bfsResult);
        }
    }

    private static char[][] deepCopy(char[][] grid) {
        char[][] copy = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) copy[i] = grid[i].clone();
        return copy;
    }
}
