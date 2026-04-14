class _1509_TwoPointersOperationsVariation9 {
    public boolean solve(String s, String t) {
        // Is Subsequence
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args) {}
}
