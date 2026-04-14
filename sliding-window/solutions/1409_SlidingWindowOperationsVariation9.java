class _1409_SlidingWindowOperationsVariation9 {
    public int solve(String s, int k) {
        // Max Consecutive Ones III (longest subarray of 1s with at most K 0s)
        int L = 0, max = 0, zeroes = 0;
        for (int R=0; R<s.length(); R++) {
            if (s.charAt(R) == '0') zeroes++;
            while (zeroes > k) {
                if (s.charAt(L++) == '0') zeroes--;
            }
            max = Math.max(max, R - L + 1);
        }
        return max;
    }
    public static void main(String[] args) {}
}
