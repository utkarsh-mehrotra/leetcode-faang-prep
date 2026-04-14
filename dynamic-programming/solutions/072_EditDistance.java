class _072_EditDistance {
    Integer[][] memo;
    public int solve(String word1, String word2) {
        memo = new Integer[word1.length()][word2.length()];
        return dfs(word1, word2, word1.length()-1, word2.length()-1);
    }
    private int dfs(String w1, String w2, int i, int j) {
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;
        if (memo[i][j] != null) return memo[i][j];
        if (w1.charAt(i) == w2.charAt(j)) return memo[i][j] = dfs(w1, w2, i-1, j-1);
        int insert = dfs(w1, w2, i, j-1);
        int delete = dfs(w1, w2, i-1, j);
        int replace = dfs(w1, w2, i-1, j-1);
        return memo[i][j] = 1 + Math.min(replace, Math.min(insert, delete));
    }
    public static void main(String[] args) {}
}
