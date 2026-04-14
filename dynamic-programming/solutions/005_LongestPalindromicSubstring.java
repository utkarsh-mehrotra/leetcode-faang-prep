class _005_LongestPalindromicSubstring {
    Integer[][] memo;
    public String solve(String s) {
        if(s == null || s.length() == 0) return "";
        int n = s.length();
        memo = new Integer[n][n]; // 1: true, 0: false
        int maxL = 0, start = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if (isPalindrome(s, i, j) == 1 && j - i + 1 > maxL) {
                    maxL = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxL);
    }
    private int isPalindrome(String s, int i, int j) {
        if (i >= j) return 1;
        if (memo[i][j] != null) return memo[i][j];
        if (s.charAt(i) != s.charAt(j)) return memo[i][j] = 0;
        return memo[i][j] = isPalindrome(s, i+1, j-1);
    }
    public static void main(String[] args) {}
}
