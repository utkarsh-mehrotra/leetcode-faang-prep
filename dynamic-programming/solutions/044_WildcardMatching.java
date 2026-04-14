class _044_WildcardMatching {
    Integer[][] memo;
    public boolean solve(String s, String p) {
        memo = new Integer[s.length()+1][p.length()+1];
        return dp(0, 0, s, p);
    }
    private boolean dp(int i, int j, String s, String p) {
        if (memo[i][j] != null) return memo[i][j] == 1;
        if (j == p.length()) return i == s.length();
        boolean ans;
        if (p.charAt(j) == '*') {
            ans = dp(i, j+1, s, p) || (i < s.length() && dp(i+1, j, s, p));
        } else {
            boolean match = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?');
            ans = match && dp(i+1, j+1, s, p);
        }
        memo[i][j] = ans ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {}
}
