import java.util.*;
class _1027_ArraysOperationsVariation27 {
    public List<Integer> solve(int[] nums) {
        // Find All Numbers Disappeared in Array
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) nums[index] *= -1;
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
    public static void main(String[] args) {}
}
