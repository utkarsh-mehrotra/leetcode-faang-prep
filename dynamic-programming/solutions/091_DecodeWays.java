class _091_DecodeWays {
    Integer[] memo;
    public int solve(String s) {
        memo = new Integer[s.length()];
        return dfs(s, 0);
    }
    private int dfs(String s, int index) {
        if (index == s.length()) return 1;
        if (s.charAt(index) == '0') return 0;
        if (index == s.length() - 1) return 1;
        if (memo[index] != null) return memo[index];
        int ans = dfs(s, index + 1);
        if (Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ans += dfs(s, index + 2);
        }
        return memo[index] = ans;
    }
    public static void main(String[] args) {}
}
