# 🧠 Dynamic Programming

Top 30 FAANG dynamic programming problems sorted by interview frequency (2023–2026).

## Resources

| File | Description |
|---|---|
| [`resources/FAANG_DP_Problems.xlsx`](resources/FAANG_DP_Problems.xlsx) | Full 5-sheet Excel: top-30 DP problems, pattern legend, 5-week roadmap, company matrix, templates |

## Patterns Covered

| Pattern | Colour | Key Problems |
|---|---|---|
| **1D DP** (Fibonacci, Decision, Kadane's) | 🔵 Blue | #70, #198, #213, #53, #152, #322, #518 |
| **Unbounded Knapsack** | 🟢 Green | #322, #518, #377 |
| **0/1 Knapsack** | 🟩 Lt Green | #416, #494, #115 |
| **LCS / 2D String DP** | 🟠 Orange | #1143, #72, #97, #10, #44 |
| **LIS** | 🟡 Yellow | #300 |
| **2D Grid DP** | 🟣 Purple | #62, #64, #174, #5, #647 |
| **State Machine DP** | 🟤 Violet | #121, #309, #188 |
| **Interval DP** | 🔴 Red | #312 |
| **DFS + Memoization** | 🔴 Red | #329, #140 |

## The 5-Step DP Framework

Use this every time in an interview:

1. **Identify** — Is it min/max? Count ways? Decision over a sequence?
2. **Define State** — What does `dp[i]` or `dp[i][j]` mean exactly?
3. **Recurrence** — How do I compute `dp[i]` from smaller subproblems?
4. **Base Cases** — Initialize `dp[0]`, `dp[0][0]` etc.
5. **Optimize Space** — Can I drop from `O(N×M)` → `O(N)` → `O(1)`?

## Top 5 Must-Solve First

| # | Problem | Freq | Pattern |
|---|---|---|---|
| 70  | Climbing Stairs         | ★ 97/100 | 1D DP (Fibonacci) |
| 198 | House Robber            | ★ 95/100 | 1D DP (Decision) |
| 322 | Coin Change             | ★ 94/100 | Unbounded Knapsack |
| 53  | Maximum Subarray        | ★ 93/100 | 1D DP / Kadane's |
| 139 | Word Break              | ★ 92/100 | String Segmentation DP |

## Solutions

All solutions are in **Java**. Files follow the naming convention `<LC#>_<PascalCaseTitle>.java`.

| File | Problem | Pattern |
|---|---|---|
| [`070_ClimbingStairs.java`](solutions/070_ClimbingStairs.java) | Climbing Stairs | 1D DP (Fibonacci) |
| [`322_CoinChange.java`](solutions/322_CoinChange.java) | Coin Change | Unbounded Knapsack |
