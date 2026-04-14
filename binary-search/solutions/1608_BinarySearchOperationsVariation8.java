class _1608_BinarySearchOperationsVariation8 {
    public int solve(int n) {
        // First Bad Version (Generic Wrapper)
        int L = 1, R = n;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (isBadVersion(mid)) R = mid;
            else L = mid + 1;
        }
        return L;
    }
    private boolean isBadVersion(int version) { return false; } // stub
    public static void main(String[] args) {}
}
