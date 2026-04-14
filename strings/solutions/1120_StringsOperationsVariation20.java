import java.util.*;
class _1120_StringsOperationsVariation20 {
    public int solve(String s) {
        // Longest Substring with At Most K Distinct Characters template
        int[] count = new int[256];
        int numDistinct = 0, maxLen = 0, left = 0;
        int k = 2; // Assuming K=2 for testing stub
        for (int right = 0; right < s.length(); right++) {
            if (count[s.charAt(right)] == 0) numDistinct++;
            count[s.charAt(right)]++;
            while (numDistinct > k) {
                count[s.charAt(left)]--;
                if (count[s.charAt(left)] == 0) numDistinct--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {}
}
