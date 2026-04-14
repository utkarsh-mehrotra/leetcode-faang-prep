class _1130_StringsOperationsVariation30 {
    public boolean solve(String str) {
        // Check if string contains all unique chars
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {}
}
