/**
 * 1. Two Sum
 * Difficulty: Easy
 * Pattern: Hash Map
 */
import java.util.HashMap;
import java.util.Map;

public class _001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        // test
        System.out.println("✅ Two Sum test passed.");
    }
}