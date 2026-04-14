import java.util.*;
class _1808_StackQueueOperationsVariation8 {
    public String solve(String s) {
        // Remove All Adjacent Duplicates in String II
        Stack<int[]> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) stack.peek()[1]++;
            else stack.push(new int[]{c, 1});
            if (stack.peek()[1] == 2) stack.pop(); // K=2
        }
        StringBuilder sb = new StringBuilder();
        for (int[] a : stack) {
            for (int i=0; i<a[1]; i++) sb.append((char)a[0]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {}
}
