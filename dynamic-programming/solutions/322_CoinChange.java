/**
 * 322. Coin Change
 *
 * Difficulty   : Medium
 * Pattern      : Unbounded Knapsack
 * Acceptance   : 43.2%
 * Time         : O(N × Amount)   — N = number of coin denominations
 * Space        : O(Amount)
 * Companies    : Google, Amazon, Meta, Microsoft, Apple
 * Frequency    : ★ 94 / 100  (FAANG 2023–2026)
 *
 * Problem
 * -------
 * Given an array of coin denominations and a target amount,
 * return the fewest number of coins needed to make up that amount.
 * Return -1 if it cannot be made.
 *
 * Example 1:  coins = [1,5,11],  amount = 15  →  3  (5+5+5)
 * Example 2:  coins = [2],       amount = 3   →  -1
 *
 * Key Insight (Unbounded Knapsack)
 * --------------------------------
 * - Each coin can be used unlimited times   → "Unbounded"
 * - We want the MINIMUM coins               → minimisation knapsack
 * - dp[a] = min coins to make exactly amount a
 * - Recurrence: dp[a] = min(dp[a], dp[a - coin] + 1)  for each coin ≤ a
 * - Fill dp forward (bottom-up); no ordering constraint on coin loop.
 */
import java.util.Arrays;

class _322_CoinChange {

    // ── Approach 1: Bottom-Up DP (standard interview answer) ──────────────────
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);    // sentinel: impossible value
        dp[0] = 0;                      // base: 0 coins to make 0

        for (int coin : coins) {
            for (int a = coin; a <= amount; a++) {
                dp[a] = Math.min(dp[a], dp[a - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // ── Approach 2: Top-Down DP (DFS + Memoization) ───────────────────────────
    private int[] memo;

    public int coinChangeTopDown(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        int result = dfs(coins, amount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int dfs(int[] coins, int rem) {
        if (rem == 0)  return 0;
        if (rem < 0)   return Integer.MAX_VALUE;
        if (memo[rem] != -1) return memo[rem];

        int best = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = dfs(coins, rem - coin);
            if (sub != Integer.MAX_VALUE) best = Math.min(best, sub + 1);
        }
        memo[rem] = best;
        return best;
    }

    // ── Tests ──────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        _322_CoinChange sol = new _322_CoinChange();

        Object[][] cases = {
            new Object[]{new int[]{1, 5, 11}, 15,    3},
            new Object[]{new int[]{1, 2, 5},  11,    3},
            new Object[]{new int[]{2},          3,   -1},
            new Object[]{new int[]{1},           0,   0},
            new Object[]{new int[]{186,419,83,408}, 6249, 20},
        };

        for (Object[] tc : cases) {
            int[] coins  = (int[]) tc[0];
            int amount   = (int)   tc[1];
            int expected = (int)   tc[2];

            int bu = sol.coinChange(coins, amount);
            // Fresh instance for memo reset
            int td = new _322_CoinChange().coinChangeTopDown(coins, amount);
            boolean ok = bu == expected && td == expected;
            System.out.printf("%s  coins=%-20s amount=%-5d expected=%-4d bu=%-4d td=%-4d%n",
                              ok ? "✅" : "❌", Arrays.toString(coins), amount, expected, bu, td);
        }
    }
}
