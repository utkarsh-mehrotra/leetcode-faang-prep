class _647_PalindromicSubstrings {
    Integer[][] memo;
    public int solve(String s) {
        memo = new Integer[s.length()][s.length()];
        int res = 0;
        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                if (isPal(s, i, j)) res++;
            }
        }
        return res;
    }
    private boolean isPal(String s, int L, int R) {
        if (L >= R) return true;
        if (memo[L][R] != null) return memo[L][R] == 1;
        boolean ans = s.charAt(L) == s.charAt(R) && isPal(s, L+1, R-1);
        memo[L][R] = ans ? 1 : 0;
        return ans;
    }
    public static void main(String[] args) {}
}
