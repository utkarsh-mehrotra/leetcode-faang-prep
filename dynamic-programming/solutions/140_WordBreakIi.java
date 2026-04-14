import java.util.*;
class _140_WordBreakIi {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet<>(wordDict), new HashMap<>());
    }
    private List<String> dfs(String s, Set<String> dict, Map<String, List<String>> map) {
        if (map.containsKey(s)) return map.get(s);
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : dict) {
            if (s.startsWith(word)) {
                List<String> subList = dfs(s.substring(word.length()), dict, map);
                for (String sub : subList) {
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }
        map.put(s, res);
        return res;
    }
    public static void main(String[] args) {}
}
