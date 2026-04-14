/**
 * 70. Climbing Stairs
 *
 * Difficulty   : Easy
 * Pattern      : 1D DP (Fibonacci)
 * Acceptance   : 51.4%
 * Time         : O(N)
 * Space        : O(1)  — rolling variables, no array needed
 * Companies    : Google, Amazon, Meta, Microsoft, Apple
 * Frequency    : ★ 97 / 100  (FAANG 2023–2026)
 *
 * Problem
 * -------
 * You are climbing a staircase with N steps.
 * Each time you can climb 1 or 2 steps.
 * Return the number of distinct ways to reach the top.
 *
 * Key Insight
 * -----------
 * ways(n) = ways(n-1) + ways(n-2)   ←  identical to Fibonacci
 * Base: ways(1) = 1, ways(2) = 2
 *
 * This is the entry-point pattern for ALL 1D DP problems.
 * Interviewers expect you to immediately recognise the recurrence
 * and then optimise space from O(N) → O(1).
 */
public class _070_ClimbingStairs {

    // ── Approach 1: Space-Optimised DP — O(1) space (preferred in interviews) ─
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2    = prev1;
            prev1    = curr;
        }
        return prev1;
    }

    // ── Approach 2: Classic DP array — O(N) space (easier to explain first) ───
    public int climbStairsDP(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    // ── Tests ──────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        _070_ClimbingStairs sol = new _070_ClimbingStairs();
        int[][] cases = {{1,1},{2,2},{3,3},{4,5},{5,8},{10,89},{45,1836311903}};
        for (int[] tc : cases) {
            int n = tc[0], expected = tc[1];
            int opt = sol.climbStairs(n);
            int dp  = sol.climbStairsDP(n);
            boolean ok = opt == expected && dp == expected;
            System.out.printf("%s  n=%-3d expected=%-12d opt=%-12d dp=%-12d%n",
                              ok ? "✅" : "❌", n, expected, opt, dp);
        }
    }
}
