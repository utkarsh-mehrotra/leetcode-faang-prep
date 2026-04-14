class _1113_StringsOperationsVariation13 {
    public String solve(String s) {
        // Reverse Words in a String In-Place
        char[] a = s.toCharArray();
        int n = a.length;
        reverse(a, 0, n - 1);
        reverseWords(a, n);
        return cleanSpaces(a, n); // Returns correctly spaced String
    }
    private void reverse(char[] a, int i, int j) {
        while (i < j) { char t = a[i]; a[i++] = a[j]; a[j--] = t; }
    }
    private void reverseWords(char[] a, int n) {
        int i = 0, j = 0;
        while (i < n) {
            while (i < i || i < n && a[i] == ' ') i++; // skip spaces
            while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
            reverse(a, i, j - 1);
        }
    }
    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && a[j] == ' ') j++;
            while (j < n && a[j] != ' ') a[i++] = a[j++];
            while (j < n && a[j] == ' ') j++;
            if (j < n) a[i++] = ' ';
        }
        return new String(a).substring(0, i);
    }
    public static void main(String[] args) {}
}
