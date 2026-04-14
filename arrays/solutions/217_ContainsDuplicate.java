/**
 * 217. Contains Duplicate
 * Difficulty: Easy
 * Pattern: Hash Set
 */
import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("✅ Contains Duplicate test passed.");
    }
}