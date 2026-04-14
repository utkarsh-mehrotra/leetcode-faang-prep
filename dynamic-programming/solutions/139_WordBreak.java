import java.util.*;
class _139_WordBreak {
    Integer[] memo;
    public boolean solve(String s, List<String> wordDict) {
        memo = new Integer[s.length()];
        return dfs(s, new HashSet<>(wordDict), 0);
    }
    private boolean dfs(String s, Set<String> dict, int start) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start] == 1;
        for (int end = start + 1; end <= s.length(); end++) {
            if (dict.contains(s.substring(start, end)) && dfs(s, dict, end)) {
                memo[start] = 1;
                return true;
            }
        }
        memo[start] = 0;
        return false;
    }
    public static void main(String[] args) {}
}
