class _1115_StringsOperationsVariation15 {
    public int solve(String s) {
        // First Unique Character in a String
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {}
}
