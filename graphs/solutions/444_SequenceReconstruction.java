import java.util.*;
class _444_SequenceReconstruction {
    public boolean sequenceReconstruction(int[] nums, List<List<Integer>> sequences) {
        Map<Integer, Set<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> indegree = new HashMap<>();
        for (List<Integer> seq : sequences) {
            for (int i=0; i<seq.size(); i++) {
                adj.putIfAbsent(seq.get(i), new HashSet<>());
                indegree.putIfAbsent(seq.get(i), 0);
            }
            for (int i=0; i<seq.size()-1; i++) {
                int u = seq.get(i), v = seq.get(i+1);
                if (adj.get(u).add(v)) {
                    indegree.put(v, indegree.get(v) + 1);
                }
            }
        }
        if (indegree.size() != nums.length) return false;
        
        Queue<Integer> q = new LinkedList<>();
        for (int k : indegree.keySet()) {
            if (indegree.get(k) == 0) q.offer(k);
        }
        
        int idx = 0;
        while (!q.isEmpty()) {
            if (q.size() > 1) return false;
            int curr = q.poll();
            if (nums[idx++] != curr) return false;
            for (int next : adj.get(curr)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) q.offer(next);
            }
        }
        return idx == nums.length;
    }
    public static void main(String[] args) {}
}
