import java.util.*;
class _1306_BacktrackingOperationsVariation6 {
    public List<List<Integer>> solve(int[] nums) {
        // Subsets II (With Duplicates)
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i=start; i<nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(res, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {}
}
