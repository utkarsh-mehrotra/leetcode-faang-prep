class _1610_BinarySearchOperationsVariation10 {
    public int solve(int x) {
        // Sqrt(x) using Binary Search
        if (x < 2) return x;
        long L = 2, R = x / 2;
        while (L <= R) {
            long mid = L + (R - L) / 2;
            long num = mid * mid;
            if (num > x) R = mid - 1;
            else if (num < x) L = mid + 1;
            else return (int)mid;
        }
        return (int)R;
    }
    public static void main(String[] args) {}
}
