class _1106_StringsOperationsVariation6 {
    public int solve(String s, String pattern) {
        // KMP Algorithm
        if (pattern.length() == 0) return 0;
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0;
        while (i < s.length()) {
            if (pattern.charAt(j) == s.charAt(i)) { i++; j++; }
            if (j == pattern.length()) return i - j;
            else if (i < s.length() && pattern.charAt(j) != s.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return -1;
    }
    private int[] computeLPS(String pat) {
        int[] lps = new int[pat.length()];
        int len = 0, i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++; lps[i] = len; i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else { lps[i] = 0; i++; }
            }
        }
        return lps;
    }
    public static void main(String[] args) {}
}
