import java.util.*;
class _140_WordBreakIi {
    Map<Integer, List<String>> memo = new HashMap<>(); // complex return type needs HashMap cache
    public List<String> solve(String s, List<String> wordDict) {
        return dfs(s, new HashSet<>(wordDict), 0);
    }
    private List<String> dfs(String s, Set<String> dict, int start) {
        if (memo.containsKey(start)) return memo.get(start);
        List<String> res = new ArrayList<>();
        if (start == s.length()) { res.add(""); return res; }
        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (dict.contains(word)) {
                List<String> list = dfs(s, dict, end);
                for (String l : list) {
                    res.add(word + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        memo.put(start, res);
        return res;
    }
    public static void main(String[] args) {}
}
