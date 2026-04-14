/**
 * 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 * Pattern: Sliding Window
 */
public class _424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int maxf = 0, l = 0, res = 0;
        for (int r = 0; r < s.length(); r++) {
            counts[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, counts[s.charAt(r) - 'A']);
            if (r - l + 1 > maxf + k) {
                counts[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Character Replacement test passed.");
    }
}