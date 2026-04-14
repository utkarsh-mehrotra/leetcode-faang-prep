class _329_LongestIncreasingPathInAMatrix {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] memo = new int[m][n];
        int max = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                max = Math.max(max, dfs(matrix, i, j, memo));
            }
        }
        return max;
    }
    private int dfs(int[][] matrix, int i, int j, int[][] memo) {
        if (memo[i][j] != 0) return memo[i][j];
        int max = 1;
        for (int[] d : dirs) {
            int r = i + d[0], c = j + d[1];
            if (r>=0 && c>=0 && r<matrix.length && c<matrix[0].length && matrix[r][c] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, r, c, memo));
            }
        }
        memo[i][j] = max;
        return max;
    }
    public static void main(String[] args) {}
}
