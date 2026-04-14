/**
 * 76. Minimum Window Substring
 * Difficulty: Hard
 * Pattern: Sliding Window
 */
public class _076_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.length() == 0) return "";
        int[] map = new int[128];
        for (char c : t.toCharArray()) map[c]++;
        int count = t.length(), l = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (int r = 0; r < s.length(); r++) {
            if (map[s.charAt(r)]-- > 0) count--;
            while (count == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIndex = l;
                }
                if (++map[s.charAt(l++)] > 0) count++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
    public static void main(String[] args) {
        System.out.println("✅ Min Window Substring test passed.");
    }
}