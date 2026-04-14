class _115_DistinctSubsequences {
    Integer[][] memo;
    public int solve(String s, String t) {
        memo = new Integer[s.length()][t.length()];
        return dfs(s, t, 0, 0);
    }
    private int dfs(String s, String t, int i, int j) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (memo[i][j] != null) return memo[i][j];
        int count = dfs(s, t, i+1, j);
        if (s.charAt(i) == t.charAt(j)) {
            count += dfs(s, t, i+1, j+1);
        }
        return memo[i][j] = count;
    }
    public static void main(String[] args) {}
}
