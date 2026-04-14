# 🚀 LeetCode Playbook

> A living, incrementally-built repository of curated LeetCode problems, pattern notes, and resources
> organised by topic — targeting **Google · Amazon · Meta · Microsoft · Apple** interviews since 2023.

---

## 📂 Repository Structure

```
leetcode-faang-prep/
│
├── graphs/                         ← Graph problems (BFS, DFS, Toposort, Union-Find, Dijkstra …)
│   ├── solutions/                  ← Per-problem solution files
│   └── resources/
│       └── FAANG_Graph_Problems.xlsx   ← Top-30 Excel sheet with frequency, complexity & roadmap
│
├── arrays/                         ← Array & prefix-sum problems
├── strings/                        ← String manipulation, sliding window, hashing
├── trees/                          ← Binary trees, BST, segment trees
├── dynamic-programming/            ← 1D / 2D DP, knapsack, LCS, LIS …
├── backtracking/                   ← Permutations, subsets, N-Queens …
├── sliding-window/                 ← Fixed & variable window problems
├── two-pointers/                   ← Two-pointer & three-pointer techniques
├── binary-search/                  ← Classic BS, BS on answer, rotated arrays …
├── heap-priority-queue/            ← Top-K, median, merge K lists …
└── stack-queue/                    ← Monotonic stack, queue-based problems
```

---

## 🗺️ Topics Tracker

| Topic | Status | Problems Added | Excel / Notes |
|---|---|---|---|
| **Graphs** | 🟢 Done | 30 | [FAANG_Graph_Problems.xlsx](graphs/resources/FAANG_Graph_Problems.xlsx) |
| **Dynamic Programming** | 🟢 Done | 30 | [FAANG_DP_Problems.xlsx](dynamic-programming/resources/FAANG_DP_Problems.xlsx) |
| **Arrays** | 🟢 Done | 30 | [FAANG_Arrays_Problems.xlsx](arrays/resources/FAANG_Arrays_Problems.xlsx) |
| **Strings** | 🟢 Done | 30 | [FAANG_Strings_Problems.xlsx](strings/resources/FAANG_Strings_Problems.xlsx) |
| **Trees** | 🟢 Done | 30 | [FAANG_Trees_Problems.xlsx](trees/resources/FAANG_Trees_Problems.xlsx) |
| **Backtracking** | 🟢 Done | 30 | [FAANG_Backtracking_Problems.xlsx](backtracking/resources/FAANG_Backtracking_Problems.xlsx) |
| **Sliding Window** | 🟢 Done | 30 | [FAANG_Sliding-Window_Problems.xlsx](sliding-window/resources/FAANG_Sliding_Window_Problems.xlsx) |
| **Two Pointers** | 🟢 Done | 30 | [FAANG_Two-Pointers_Problems.xlsx](two-pointers/resources/FAANG_Two_Pointers_Problems.xlsx) |
| **Binary Search** | 🟢 Done | 30 | [FAANG_Binary-Search_Problems.xlsx](binary-search/resources/FAANG_Binary_Search_Problems.xlsx) |
| **Heap / Priority Queue** | 🟢 Done | 30 | [FAANG_Heap-Priority-Queue_Problems.xlsx](heap-priority-queue/resources/FAANG_Heap_Priority_Queue_Problems.xlsx) |
| **Stack / Queue** | 🟢 Done | 30 | [FAANG_Stack-Queue_Problems.xlsx](stack-queue/resources/FAANG_Stack_Queue_Problems.xlsx) |

---

## 🔷 100% Java Implementation (330 Natively Compiling Algorithms)

This repository has been fully scaled to contain **330 complete, optimally coded Java solutions** covering all 11 Leetcode topical patterns.

- 📊 **330 core algorithms** spanning 11 categories (30 per category)
- ⚙️ **`package-private` class structure** ensuring zero `duplicate class` collision issues during compilation.
- 🚀 **Built-in `./bin/run.sh` automated CLI** testing suite to rapidly compile and run any algorithm.
- 💡 **Optimal implementations** covering Kadane's, Kahn's Topological Sort, Morris Traversals, Knapsacks, Tarjan's Bridge-Finding, and more.
- 🏢 **Company × Problem matrix** (Google / Amazon / Meta / Microsoft / Apple checkmarks) provided in each module's Excel.

### 🔑 Key Graph Patterns Covered

| Pattern | Example Problems |
|---|---|
| BFS / DFS (Grid) | #200 Number of Islands, #695 Max Area of Island, #733 Flood Fill |
| Multi-Source BFS | #994 Rotting Oranges, #417 Pacific Atlantic Water Flow |
| Topological Sort | #207 Course Schedule, #210 Course Schedule II, #269 Alien Dictionary |
| Union-Find (DSU) | #547 Number of Provinces, #684 Redundant Connection, #721 Accounts Merge |
| Dijkstra's Algorithm | #743 Network Delay Time, #778 Swim in Rising Water |
| Bellman-Ford | #787 Cheapest Flights Within K Stops |
| Floyd-Warshall | #1334 Find City With Smallest Neighbors |
| Tarjan's (Bridges) | #1192 Critical Connections in a Network |
| Eulerian Path | #332 Reconstruct Itinerary |
| Bipartite / 2-Coloring | #785 Is Graph Bipartite?, #1129 Shortest Path with Alternating Colors |

---

## 🧠 Dynamic Programming — Full Matrix

- 📊 **30 high-frequency DP problems** from FAANG interviews (2023–2026)
- 📅 **5-week practice roadmap** (1D Foundations → Knapsack+Grid → String+Stock → Hard I → Hard II)
- 💡 Extensive 1D and 2D arrays, unbounded/fractional knapsacks, state machines.

### 🔑 Key DP Patterns Covered

| Pattern | Example Problems |
|---|---|
| 1D DP (Fibonacci / Decision) | #70 Climbing Stairs, #198 House Robber, #213 House Robber II |
| 1D DP (Kadane's / Min-Max) | #53 Maximum Subarray, #152 Maximum Product Subarray |
| Unbounded Knapsack | #322 Coin Change, #518 Coin Change II, #377 Combination Sum IV |
| 0/1 Knapsack | #416 Partition Equal Subset Sum, #494 Target Sum |
| LCS / Edit Distance | #1143 Longest Common Subsequence, #72 Edit Distance |
| LIS | #300 Longest Increasing Subsequence |
| 2D Grid DP | #62 Unique Paths, #64 Minimum Path Sum, #174 Dungeon Game |
| Palindrome DP | #5 Longest Palindromic Substring, #647 Palindromic Substrings |
| State Machine DP | #121/#309/#188 Stock series |
| Interval DP | #312 Burst Balloons |
| DFS + Memoization | #329 Longest Increasing Path in Matrix, #140 Word Break II |

---

## 📋 How This Repo Is Built

Each topic will follow the same template when added:

1. **Research** — FAANG interview frequency + company data
2. **Excel sheet** — Problems sorted by frequency with difficulty, complexity, companies, links
3. **Solutions folder** — Clean, commented solutions in Python (+ Java where relevant)
4. **Roadmap** — Week-by-week practice plan inside the Excel
5. **README update** — This tracker updated

---

## 🏃 Quick Start

```bash
# Clone the playbook
git clone https://github.com/utkarsh-mehrotra/leetcode-playbook.git
cd leetcode-playbook

# Open the Graph problems Excel (macOS)
open graphs/resources/FAANG_Graph_Problems.xlsx

# Open the DP problems Excel (macOS)
open dynamic-programming/resources/FAANG_DP_Problems.xlsx
```

---

## 🤝 Contributing

This is a personal prep repo — but feel free to open issues or PRs if you spot errors
in difficulty ratings, acceptance rates, or company tags.

---

*Updated: April 2026 · Maintained by [@utkarsh-mehrotra](https://github.com/utkarsh-mehrotra)*
