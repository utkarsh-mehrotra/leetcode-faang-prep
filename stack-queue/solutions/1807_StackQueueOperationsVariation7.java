import java.util.*;
class _1807_StackQueueOperationsVariation7 {
    public int[] solve(int[] nums) {
        // Next Greater Element II (Circular Array)
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n*2; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                res[stack.pop()] = nums[i % n];
            }
            if (i < n) stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {}
}
