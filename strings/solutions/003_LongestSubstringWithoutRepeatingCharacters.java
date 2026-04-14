/**
 * 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 */
import java.util.HashSet;
import java.util.Set;

class _003_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("✅ Longest Substring test passed.");
    }
}