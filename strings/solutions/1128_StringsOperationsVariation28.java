class _1128_StringsOperationsVariation28 {
    public String solve(String s) {
        // To Lower Case natively
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') arr[i] = (char)(arr[i] + 32);
        }
        return new String(arr);
    }
    public static void main(String[] args) {}
}
