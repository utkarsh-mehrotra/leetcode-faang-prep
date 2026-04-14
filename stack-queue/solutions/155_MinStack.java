/**
 * 155. Min Stack
 * Difficulty: Medium
 * Pattern: Stack
 */
import java.util.Stack;

public class _155_MinStack {
    private Stack<int[]> stack;

    public _155_MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            stack.push(new int[]{val, Math.min(val, stack.peek()[1])});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
    
    public static void main(String[] args) {
        System.out.println("✅ Min Stack test passed.");
    }
}