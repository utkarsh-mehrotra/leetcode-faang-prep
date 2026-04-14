class _1127_StringsOperationsVariation27 {
    public String solve(String num1, String num2) {
        // Add Strings (Big Integer equivalent)
        StringBuilder sb = new StringBuilder();
        int carry = 0, p1 = num1.length() - 1, p2 = num2.length() - 1;
        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int sum = x1 + x2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            p1--; p2--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {}
}
