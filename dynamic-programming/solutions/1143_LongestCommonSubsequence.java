class _1143_LongestCommonSubsequence {
    Integer[][] memo;
    public int solve(String text1, String text2) {
        memo = new Integer[text1.length()][text2.length()];
        return dfs(text1, text2, 0, 0);
    }
    private int dfs(String t1, String t2, int i, int j) {
        if (i == t1.length() || j == t2.length()) return 0;
        if (memo[i][j] != null) return memo[i][j];
        if (t1.charAt(i) == t2.charAt(j)) return memo[i][j] = 1 + dfs(t1, t2, i+1, j+1);
        return memo[i][j] = Math.max(dfs(t1, t2, i+1, j), dfs(t1, t2, i, j+1));
    }
    public static void main(String[] args) {}
}
