import java.util.*;
class _332_ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        for (List<String> t : tickets) {
            adj.putIfAbsent(t.get(0), new PriorityQueue<>());
            adj.get(t.get(0)).offer(t.get(1));
        }
        LinkedList<String> res = new LinkedList<>();
        dfs("JFK", adj, res);
        return res;
    }
    private void dfs(String src, Map<String, PriorityQueue<String>> adj, LinkedList<String> res) {
        PriorityQueue<String> pq = adj.get(src);
        while (pq != null && !pq.isEmpty()) {
            dfs(pq.poll(), adj, res);
        }
        res.addFirst(src);
    }
    public static void main(String[] args) {}
}
