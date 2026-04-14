import java.util.*;
class _1806_StackQueueOperationsVariation6 {
    public int solve(int[] heights) {
        // Largest Rectangle in Histogram (Monotonic Stack)
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int[] h = new int[heights.length + 1];
        for(int i=0; i<heights.length; i++) h[i] = heights[i];
        for(int i=0; i<h.length; i++) {
            while(!stack.isEmpty() && h[i] < h[stack.peek()]) {
                int height = h[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {}
}
