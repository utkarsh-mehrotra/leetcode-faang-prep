class _097_InterleavingString {
    Integer[][] memo;
    public boolean solve(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        memo = new Integer[s1.length()+1][s2.length()+1];
        return dfs(s1, s2, s3, 0, 0, 0);
    }
    private boolean dfs(String s1, String s2, String s3, int i, int j, int k) {
        if (i == s1.length() && j == s2.length()) return true;
        if (memo[i][j] != null) return memo[i][j] == 1;
        boolean ans = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) ans |= dfs(s1, s2, s3, i+1, j, k+1);
        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) ans |= dfs(s1, s2, s3, i, j+1, k+1);
        memo[i][j] = ans ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {}
}
