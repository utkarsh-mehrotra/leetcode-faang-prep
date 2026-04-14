import java.util.*;
class _1317_BacktrackingOperationsVariation17 {
    public List<List<Integer>> solve(int n) {
        // Combinations (n choose k baseline iteration)
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), 1, n, 2); // default k=2
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int start, int n, int k) {
        if (temp.size() == k) { res.add(new ArrayList<>(temp)); return; }
        for (int i=start; i<=n; i++) {
            temp.add(i);
            backtrack(res, temp, i+1, n, k);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {}
}
