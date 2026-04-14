class _1121_StringsOperationsVariation21 {
    public String solve(String S) {
        // Generic Caesar Cipher / Shift string left/right
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            sb.append((char)('a' + (c - 'a' + 1) % 26));
        }
        return sb.toString();
    }
    public static void main(String[] args) {}
}
