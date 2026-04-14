class _1122_StringsOperationsVariation22 {
    public int solve(String s) {
        // String to Integer Atoi Generic implementation
        int index = 0, sign = 1, total = 0;
        if(s.length() == 0) return 0;
        while(index < s.length() && s.charAt(index) == ' ') index++;
        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while(index < s.length()){
            int digit = s.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }
    public static void main(String[] args) {}
}
