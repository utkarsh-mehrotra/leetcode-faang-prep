import java.util.*;
class _1308_BacktrackingOperationsVariation8 {
    public List<List<Integer>> solve(int[] candidates, int target) {
        // Combination Sum II
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int target, int start) {
        if (target < 0) return;
        if (target == 0) { res.add(new ArrayList<>(temp)); return; }
        for (int i=start; i<nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, target - nums[i], i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {}
}
