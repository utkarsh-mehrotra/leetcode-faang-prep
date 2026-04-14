import java.util.*;
class _1020_ArraysOperationsVariation20 {
    public int solve(int[] nums) {
        // Longest Consecutive Sequence
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int longest = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int length = 0;
                while (set.contains(n + length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {}
}
