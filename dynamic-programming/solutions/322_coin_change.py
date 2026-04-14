"""
322. Coin Change
Difficulty : Medium
Pattern    : Unbounded Knapsack
Acceptance : 43.2%
Time       : O(N × Amount)
Space      : O(Amount)
Companies  : Google, Amazon, Meta, Microsoft, Apple
Frequency  : ★ 94 / 100  (FAANG 2023–2026)

Problem
-------
Given an array of coin denominations and a target amount,
return the fewest number of coins needed to make up that amount.
Return -1 if it cannot be made.

Example:
    coins = [1, 5, 11],  amount = 15  →  3  (5+5+5)
    coins = [2],         amount = 3   →  -1

Key Insight (Unbounded Knapsack)
--------------------------------
- Each coin can be used unlimited times  → unbounded
- We want MIN coins                       → minimisation knapsack
- dp[a] = min coins to make amount a
- Recurrence: dp[a] = min(dp[a], dp[a - coin] + 1) for each coin ≤ a
- Iterate coins OUTER, amounts INNER (or vice-versa — both work for unbounded)
"""

from typing import List


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # dp[a] = min coins to make exactly amount a
        dp = [float("inf")] * (amount + 1)
        dp[0] = 0                               # base: 0 coins to make 0

        for coin in coins:
            for a in range(coin, amount + 1):   # only consider amounts ≥ coin
                dp[a] = min(dp[a], dp[a - coin] + 1)

        return dp[amount] if dp[amount] != float("inf") else -1


# ── Space is already O(Amount) — no further optimisation needed ───────────────


# ── Tests ─────────────────────────────────────────────────────────────────────
if __name__ == "__main__":
    sol = Solution()
    cases = [
        ([1, 5, 11], 15, 3),   # 5+5+5
        ([1, 2, 5],  11, 3),   # 5+5+1
        ([2],        3,  -1),  # impossible
        ([1],        0,   0),  # zero amount
        ([186, 419, 83, 408], 6249, 20),
    ]
    for coins, amount, expected in cases:
        result = sol.coinChange(coins, amount)
        status = "✅" if result == expected else "❌"
        print(f"{status}  coins={coins}  amount={amount}  expected={expected}  got={result}")
