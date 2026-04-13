# 🚀 LeetCode FAANG Interview Prep

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
| **Graphs** | 🟢 Active | 30 | [FAANG_Graph_Problems.xlsx](graphs/resources/FAANG_Graph_Problems.xlsx) |
| Arrays | 🔜 Next | — | — |
| Strings | 🔜 Planned | — | — |
| Trees | 🔜 Planned | — | — |
| Dynamic Programming | 🔜 Planned | — | — |
| Backtracking | 🔜 Planned | — | — |
| Sliding Window | 🔜 Planned | — | — |
| Two Pointers | 🔜 Planned | — | — |
| Binary Search | 🔜 Planned | — | — |
| Heap / Priority Queue | 🔜 Planned | — | — |
| Stack / Queue | 🔜 Planned | — | — |

---

## 🔷 Graphs — Top 30 (Current Focus)

The `graphs/` folder contains our **first fully-researched topic set**:

- 📊 **30 high-frequency problems** from FAANG interviews (2023–2026)
- 🏷️ Each tagged with: LC#, difficulty, pattern, acceptance %, time/space complexity, companies
- 📅 **5-week practice roadmap** (Foundation → BFS+DSU → Advanced Traversal → Shortest Path → Hard Tier)
- 🏢 **Company × Problem matrix** (Google / Amazon / Meta / Microsoft / Apple checkmarks)
- 💡 Python templates for DSU, Dijkstra, Kahn's Toposort

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
# Clone the repo
git clone https://github.com/utm-git/leetcode-faang-prep.git
cd leetcode-faang-prep

# Open the Graph problems Excel (macOS)
open graphs/resources/FAANG_Graph_Problems.xlsx
```

---

## 🤝 Contributing

This is a personal prep repo — but feel free to open issues or PRs if you spot errors
in difficulty ratings, acceptance rates, or company tags.

---

*Updated: April 2026 · Maintained by [@utm-git](https://github.com/utm-git)*
