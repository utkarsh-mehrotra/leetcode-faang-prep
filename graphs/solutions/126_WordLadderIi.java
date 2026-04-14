import java.util.*;
class _126_WordLadderIi {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return res;
        
        Map<String, List<String>> adj = new HashMap<>();
        Map<String, Integer> dist = new HashMap<>();
        dict.add(beginWord);
        for (String w : dict) adj.put(w, new ArrayList<>());
        
        bfs(beginWord, endWord, dict, adj, dist);
        
        List<String> path = new ArrayList<>();
        path.add(beginWord);
        dfs(beginWord, endWord, adj, dist, path, res);
        return res;
    }
    private void bfs(String begin, String end, Set<String> dict, Map<String, List<String>> adj, Map<String, Integer> dist) {
        Queue<String> q = new LinkedList<>();
        q.offer(begin);
        dist.put(begin, 0);
        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(end)) return;
            char[] arr = curr.toCharArray();
            for (int i=0; i<arr.length; i++) {
                char old = arr[i];
                for (char c='a'; c<='z'; c++) {
                    if (c == old) continue;
                    arr[i] = c;
                    String next = new String(arr);
                    if (dict.contains(next)) {
                        adj.get(curr).add(next);
                        if (!dist.containsKey(next)) {
                            dist.put(next, dist.get(curr) + 1);
                            q.offer(next);
                        }
                    }
                }
                arr[i] = old;
            }
        }
    }
    private void dfs(String curr, String end, Map<String, List<String>> adj, Map<String, Integer> dist, List<String> path, List<List<String>> res) {
        if (curr.equals(end)) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (String next : adj.get(curr)) {
            if (dist.get(next) == dist.get(curr) + 1) {
                path.add(next);
                dfs(next, end, adj, dist, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    public static void main(String[] args) {}
}
