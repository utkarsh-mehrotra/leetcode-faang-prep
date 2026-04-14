class _010_RegularExpressionMatching {
    Integer[][] memo;
    public boolean solve(String s, String p) {
        memo = new Integer[s.length() + 1][p.length() + 1];
        return dp(0, 0, s, p);
    }
    private boolean dp(int i, int j, String s, String p) {
        if (memo[i][j] != null) return memo[i][j] == 1;
        boolean ans;
        if (j == p.length()) ans = i == s.length();
        else {
            boolean firstMatch = (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));
            if (j + 1 < p.length() && p.charAt(j+1) == '*') {
                ans = dp(i, j+2, s, p) || firstMatch && dp(i+1, j, s, p);
            } else {
                ans = firstMatch && dp(i+1, j+1, s, p);
            }
        }
        memo[i][j] = ans ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {}
}
