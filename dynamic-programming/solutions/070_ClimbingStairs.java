class _070_ClimbingStairs {
    Integer[] memo;
    public int solve(int n) {
        memo = new Integer[n+1];
        return climb(n);
    }
    private int climb(int n) {
        if (n <= 2) return n;
        if (memo[n] != null) return memo[n];
        return memo[n] = climb(n-1) + climb(n-2);
    }
    public static void main(String[] args) {}
}
