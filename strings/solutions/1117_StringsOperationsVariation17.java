import java.util.*;
class _1117_StringsOperationsVariation17 {
    public String solve(String s) {
        // Decode String iterative Stack
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) k = k * 10 + (ch - '0');
            else if (ch == '[') {
                countStack.push(k);
                resStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decoded = resStack.pop();
                for (int currentK = countStack.pop(); currentK > 0; currentK--) decoded.append(current);
                current = decoded;
            } else current.append(ch);
        }
        return current.toString();
    }
    public static void main(String[] args) {}
}
