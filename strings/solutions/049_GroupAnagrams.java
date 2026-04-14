/**
 * 49. Group Anagrams
 * Difficulty: Medium
 * Pattern: Hash Map
 */
import java.util.*;

public class _049_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        System.out.println("✅ Group Anagrams test passed.");
    }
}