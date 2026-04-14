class _329_LongestIncreasingPathInAMatrix {
    Integer[][] memo;
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int solve(int[][] matrix) {
        int max = 0;
        memo = new Integer[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                max = Math.max(max, dfs(matrix, i, j));
            }
        }
        return max;
    }
    private int dfs(int[][] m, int r, int c) {
        if (memo[r][c] != null) return memo[r][c];
        int ans = 1;
        for (int[] d : dirs) {
            int nextR = r + d[0], nextC = c + d[1];
            if (nextR >= 0 && nextC >= 0 && nextR < m.length && nextC < m[0].length && m[nextR][nextC] > m[r][c]) {
                ans = Math.max(ans, 1 + dfs(m, nextR, nextC));
            }
        }
        return memo[r][c] = ans;
    }
    public static void main(String[] args) {}
}
