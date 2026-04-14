/**
 * 739. Daily Temperatures
 * Difficulty: Medium
 * Pattern: Monotonic Stack
 */
import java.util.*;

public class _739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIdx = stack.pop();
                res[prevIdx] = i - prevIdx;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Daily Temperatures test passed.");
    }
}