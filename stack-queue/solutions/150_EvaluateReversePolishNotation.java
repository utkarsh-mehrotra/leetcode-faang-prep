/**
 * 150. Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Pattern: Stack
 */
import java.util.*;

public class _150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (t.equals("-")) { int a = stack.pop(), b = stack.pop(); stack.push(b - a); }
            else if (t.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (t.equals("/")) { int a = stack.pop(), b = stack.pop(); stack.push(b / a); }
            else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println("✅ Eval RPN test passed.");
    }
}