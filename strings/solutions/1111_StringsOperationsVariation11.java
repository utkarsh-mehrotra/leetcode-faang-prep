class _1111_StringsOperationsVariation11 {
    public int solve(String s) {
        // Longest Palindromic Substring Expansion Array
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, expand(s, i, i));
            max = Math.max(max, expand(s, i, i + 1));
        }
        return max;
    }
    private int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        return r - l - 1;
    }
    public static void main(String[] args) {}
}
