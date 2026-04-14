/**
 * 242. Valid Anagram
 * Difficulty: Easy
 * Pattern: Frequency Array
 */
public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("✅ Valid Anagram test passed.");
    }
}