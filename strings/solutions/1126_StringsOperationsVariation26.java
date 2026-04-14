class _1126_StringsOperationsVariation26 {
    public int solve(String s) {
        // Score of Parentheses recursive stack proxy
        int score = 0, bal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') bal++;
            else {
                bal--;
                if (s.charAt(i - 1) == '(') score += 1 << bal;
            }
        }
        return score;
    }
    public static void main(String[] args) {}
}
