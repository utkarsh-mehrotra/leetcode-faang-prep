"""
200. Number of Islands
Difficulty : Medium
Pattern    : DFS / BFS (Grid)
Acceptance : 54.2%
Time       : O(M × N)
Space      : O(M × N)  [recursion stack]
Companies  : Google, Amazon, Meta, Microsoft, Apple
Frequency  : ★ 98 / 100  (FAANG 2023–2026)

Problem
-------
Given an m × n 2D binary grid where '1' = land and '0' = water,
return the number of islands.

An island is surrounded by water and formed by connecting adjacent
lands horizontally or vertically.

Example 1:
    grid = [
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"],
    ]
    Output: 1

Example 2:
    grid = [
        ["1","1","0","0","0"],
        ["1","1","0","0","0"],
        ["0","0","1","0","0"],
        ["0","0","0","1","1"],
    ]
    Output: 3
"""

from typing import List
from collections import deque


# ── Approach 1: DFS (recursive, in-place marking) ─────────────────────────────
class SolutionDFS:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        rows, cols = len(grid), len(grid[0])
        count = 0

        def dfs(r: int, c: int) -> None:
            # Out of bounds or already visited / water
            if r < 0 or r >= rows or c < 0 or c >= cols or grid[r][c] != "1":
                return
            grid[r][c] = "#"          # mark visited in-place — O(1) extra space
            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1":
                    dfs(r, c)
                    count += 1

        return count


# ── Approach 2: BFS (iterative, same in-place trick) ──────────────────────────
class SolutionBFS:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        rows, cols = len(grid), len(grid[0])
        count = 0
        DIRS = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1":
                    grid[r][c] = "#"
                    queue = deque([(r, c)])
                    while queue:
                        cr, cc = queue.popleft()
                        for dr, dc in DIRS:
                            nr, nc = cr + dr, cc + dc
                            if 0 <= nr < rows and 0 <= nc < cols and grid[nr][nc] == "1":
                                grid[nr][nc] = "#"
                                queue.append((nr, nc))
                    count += 1

        return count


# ── Tests ─────────────────────────────────────────────────────────────────────
if __name__ == "__main__":
    import copy

    cases = [
        ([["1","1","1","1","0"],
          ["1","1","0","1","0"],
          ["1","1","0","0","0"],
          ["0","0","0","0","0"]], 1),
        ([["1","1","0","0","0"],
          ["1","1","0","0","0"],
          ["0","0","1","0","0"],
          ["0","0","0","1","1"]], 3),
        ([["1"]], 1),
        ([["0"]], 0),
    ]

    for grid, expected in cases:
        dfs_result = SolutionDFS().numIslands(copy.deepcopy(grid))
        bfs_result = SolutionBFS().numIslands(copy.deepcopy(grid))
        status = "✅" if dfs_result == bfs_result == expected else "❌"
        print(f"{status}  expected={expected}  dfs={dfs_result}  bfs={bfs_result}")
