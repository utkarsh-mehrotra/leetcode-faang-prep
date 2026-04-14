"""
70. Climbing Stairs
Difficulty : Easy
Pattern    : 1D DP (Fibonacci)
Acceptance : 51.4%
Time       : O(N)
Space      : O(1)
Companies  : Google, Amazon, Meta, Microsoft, Apple
Frequency  : ★ 97 / 100  (FAANG 2023–2026)

Problem
-------
You are climbing a staircase with N steps.
Each time you can climb 1 or 2 steps.
Return the number of distinct ways to reach the top.

Example:
    n = 4  →  5
    (1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2)

Key Insight
-----------
ways(n) = ways(n-1) + ways(n-2)   ← identical to Fibonacci
Base: ways(1) = 1, ways(2) = 2
This is the entry-point pattern for ALL 1D DP problems.
"""


# ── Approach 1: Space-Optimised DP (O(1) space) ───────────────────────────────
class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        prev2, prev1 = 1, 2
        for _ in range(3, n + 1):
            prev2, prev1 = prev1, prev2 + prev1
        return prev1


# ── Approach 2: Classic DP array (O(N) space — easier to explain in interview) ─
class SolutionDP:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        dp = [0] * (n + 1)
        dp[1], dp[2] = 1, 2
        for i in range(3, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]


# ── Tests ─────────────────────────────────────────────────────────────────────
if __name__ == "__main__":
    sol = Solution()
    cases = [(1, 1), (2, 2), (3, 3), (4, 5), (5, 8), (10, 89)]
    for n, expected in cases:
        result = sol.climbStairs(n)
        status = "✅" if result == expected else "❌"
        print(f"{status}  n={n:<3} expected={expected:<5} got={result}")
