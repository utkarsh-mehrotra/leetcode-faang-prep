class _1125_StringsOperationsVariation25 {
    public boolean solve(String word1, String word2) {
        // Check If Two String Arrays are Equivalent logical string builder
        StringBuilder sb1 = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {}
}
