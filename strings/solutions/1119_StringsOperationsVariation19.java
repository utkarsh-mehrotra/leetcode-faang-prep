class _1119_StringsOperationsVariation19 {
    public boolean solve(String s) {
        // Valid Parentheses checking loop (string stack)
        int openScore = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') openScore++;
            else openScore--;
            if (openScore < 0) return false;
        }
        return openScore == 0;
    }
    public static void main(String[] args) {}
}
