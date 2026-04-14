import java.util.*;
class _1110_StringsOperationsVariation10 {
    public List<Integer> solve(String s, String p) {
        // Find All Anagrams in a String (Sliding Window)
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] hash = new int[26];
        for (char c : p.toCharArray()) hash[c - 'a']++;
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++) - 'a']-- >= 1) count--;
            if (count == 0) res.add(left);
            if (right - left == p.length() && hash[s.charAt(left++) - 'a']++ >= 0) count++;
        }
        return res;
    }
    public static void main(String[] args) {}
}
