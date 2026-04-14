import java.util.*;
class _1202_SmallestStringWithSwaps {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        int[] parent = new int[n];
        for (int i=0; i<n; i++) parent[i] = i;
        
        for (List<Integer> p : pairs) {
            int root1 = find(parent, p.get(0));
            int root2 = find(parent, p.get(1));
            if (root1 != root2) parent[root1] = root2;
        }
        
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int p = find(parent, i);
            map.putIfAbsent(p, new PriorityQueue<>());
            map.get(p).offer(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(map.get(find(parent, i)).poll());
        }
        return sb.toString();
    }
    private int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }
    public static void main(String[] args) {}
}
