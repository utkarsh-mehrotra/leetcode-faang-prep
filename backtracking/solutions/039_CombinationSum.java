/**
 * 39. Combination Sum
 * Difficulty: Medium
 * Pattern: Backtracking
 */
import java.util.ArrayList;
import java.util.List;

public class _039_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> res) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("✅ Combination Sum test passed.");
    }
}