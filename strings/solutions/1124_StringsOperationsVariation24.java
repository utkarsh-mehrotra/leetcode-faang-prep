class _1124_StringsOperationsVariation24 {
    public int solve(String s) {
        // Count string vowels template
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }
    public static void main(String[] args) {}
}
