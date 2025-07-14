# 📚 Data Structures & Algorithms (DSA)

This repository is a comprehensive collection of Java-based implementations of core **Data Structures** and **Algorithms**. It is designed to help you understand, practice, and master the fundamentals of DSA for interviews, competitive programming, and real-world problem solving.

---

## 📁 Folder Structure

| Folder Name     | Description                               |
|------------------|-------------------------------------------|
| `BST`            | Binary Search Tree operations and traversal algorithms. |
| `BitManup`       | Bit manipulation problems and techniques. |
| `DS`             | Miscellaneous data structure examples. |
| `Graph_DS`       | Graph data structures and traversal (BFS, DFS). |
| `Hashset`        | HashSet usage and hashing-based problems. |
| `Searching`      | Searching algorithms (linear, binary, etc). |
| `Sorting`        | Sorting algorithms (bubble, quicksort, mergesort, etc). |
| `String_builder` | Efficient string manipulation techniques. |
| `Trie_DS`        | Implementation and usage of Trie data structure. |

---

## 💡 Key Features

- ✅ Clean and modular Java code
- ✅ Organized by topic and data structure
- ✅ Useful for coding interviews & competitive programming
- ✅ Easy to navigate and expand

---
## 🔍 Concept Overview

### 1. Linear Structures  
- **Arrays & Lists**:  
  - **Concept**: Contiguous storage, constant‑time indexed access.  
  - **Trade‑offs**: Fast reads (`O(1)`), expensive insert/delete (`O(n)`).  
  - **Folder**: `DS/`  
- **Stacks & Queues**:  
  - **Concept**: LIFO vs. FIFO ordering.  
  - **Use Cases**: Backtracking (call stacks), task scheduling, breadth‑first search.  
  - **Folder**: `DS/`  

### 2. Trees & Hierarchies  
- **Binary Trees**:  
  - **Concept**: Each node up to two children. Recursion-friendly.  
  - **Operations**: Pre‑order, in‑order, post‑order traversals (`O(n)`), height calculation.  
  - **Folder**: `BST/`  
- **Binary Search Trees (BST)**:  
  - **Concept**: Ordered tree → left < root < right.  
  - **Performance**: Search/insert/delete average `O(log n)`, worst-case `O(n)`.  
  - **Folder**: `BST/`  
- **Tries (Prefix Trees)**:  
  - **Concept**: Multi‑way tree keyed by characters → efficient string lookup.  
  - **Use Cases**: Auto‑complete, spell‑check.  
  - **Folder**: `Trie_DS/`  

### 3. Graphs & Networks  
- **Graph Representations**:  
  - **Adjacency List vs. Matrix**: List (`O(V + E)` space) for sparse graphs; matrix (`O(V²)`) for dense.  
- **Traversals**:  
  - **Depth‑First Search (DFS)**: Recursion/deep stack → path finding, cycle detection.  
  - **Breadth‑First Search (BFS)**: Queue → shortest path in unweighted graphs.  
  - **Folder**: `Graph_DS/`  

### 4. Hashing & Sets  
- **Hash Tables**:  
  - **Concept**: Key → hash function → bucket → average `O(1)` access.  
  - **Collision Resolution**: Chaining, open addressing.  
  - **Folder**: `Hashset/`  
- **Sets**:  
  - **Concept**: Unordered, unique elements.  
  - **Use Cases**: Membership tests, deduplication.  
  - **Folder**: `Hashset/`  

### 5. Bit Manipulation  
- **Concept**: Leverage binary representation for constant‑time tricks.  
- **Examples**:  
  - Bitwise AND/OR/XOR  
  - Shifting (`<<`, `>>`)  
  - Masks to extract or flip bits  
- **Folder**: `BitManup/`  

### 6. Sorting & Searching  
- **Comparison‑Based Sorts**:  
  - **Bubble, Insertion**: Easy, but `O(n²)` worst-case.  
  - **Merge, Quick, Heap**: Divide‑and‑conquer or heap structures → average `O(n log n)`.  
  - **Folder**: `Sorting/`  
- **Search Techniques**:  
  - **Linear Search**: `O(n)` scan.  
  - **Binary Search**: `O(log n)` on sorted arrays.  
  - **Folder**: `Searching/`  

### 7. String Manipulation  
- **StringBuilder & Buffer**:  
  - **Concept**: Mutable string constructs to avoid `O(n²)` concatenation cost.  
  - **Folder**: `String_builder/`
  
## 🚀 How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/raj04h/DSA.git

