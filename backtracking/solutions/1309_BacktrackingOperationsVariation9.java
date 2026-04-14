import java.util.*;
class _1309_BacktrackingOperationsVariation9 {
    public List<List<Integer>> solve(int k, int n) {
        // Combination Sum III
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int k, int remain, int start) {
        if (temp.size() == k && remain == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start; i<=9; i++) {
            temp.add(i);
            backtrack(res, temp, k, remain - i, i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {}
}
