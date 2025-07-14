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

### 1. Linear Structures (`DS/`)

**Concept**  
- **List (ArrayList)**: Ordered collection backed by array—O(1) access, O(n) insert/delete at arbitrary positions.  
- **LinkedList**: Chain of nodes—O(1) insert/delete at ends, O(n) access.  
- **Stack** (LIFO): Push/pop operations—ideal for backtracking, expression evaluation.  
- **Queue** (FIFO): Enqueue/dequeue—useful for breadth‑first search, task scheduling.

**Folder Contents**  
- `ArrayListDemo.java` – add/get/remove, dynamic resizing  
- `LinkedListDemo.java` – node insert, delete, traversal  
- `StackDemo.java` – push, pop, peek, underflow check  
- `QueueDemo.java` – enqueue, dequeue, isEmpty  

**Complexities**  
| Operation      | ArrayList | LinkedList | Stack/Queue |
|----------------|-----------|------------|-------------|
| Access         | O(1)      | O(n)       | O(1)        |
| Insert/Delete  | O(n)      | O(1)\*     | O(1)        |
| Memory         | O(n)      | O(n) + ptr | O(n)        |

_\* at head/tail in singly/doubly linked list_

---

### 2. Binary Search Tree (`BST/`)

**Concept**  
A **binary tree** in which for each node:
- left subtree nodes ≤ node  
- right subtree nodes ≥ node  

Supports dynamic set operations in logarithmic average time.

**Key Operations**  
- `insert(key)`: place new value → average O(log n)  
- `search(key)`: find node → average O(log n)  
- `delete(key)`: remove node, rebalance subtrees → average O(log n)  
- **Traversals**:  
  - Pre‑order (root, left, right)  
  - In‑order  (left, root, right)  
  - Post‑order(left, right, root)  

**Folder Contents**  
- `Node.java` – tree node class (key, left, right)  
- `BST.java` – insert, search, delete implementations  
- `Traversals.java` – static methods for pre/in/post-order  
- `Main.java` – interactive console demo  

**Complexities**  
- **Average**: O(log n) for insert/search/delete  
- **Worst**: O(n) (skewed tree)  
- **Space**: O(n)  

---

### 3. Trie / Prefix Tree (`Trie_DS/`)

**Concept**  
A **multi‑way tree** storing strings by characters. Each edge represents one character; nodes mark word completions.

**Use Cases**  
- Auto‑complete  
- Spell‑check  
- IP routing (longest prefix match)  

**Key Operations**  
- `insert(word)`: O(m) where m = word length  
- `search(word)`: O(m)  
- `startsWith(prefix)`: O(p) where p = prefix length  

**Folder Contents**  
- `TrieNode.java` – map of children, boolean endOfWord  
- `Trie.java` – insert, search, startsWith  
- `Main.java` – usage examples & test cases  

---

### 4. Graphs & Traversals (`Graph_DS/`)

**Concept**  
A graph is a set of vertices (V) connected by edges (E). Represented as:
- **Adjacency List** (preferred for sparse graphs)  
- **Adjacency Matrix** (for dense graphs / constant‑time edge check)

**Key Algorithms**  
- **Breadth‑First Search (BFS)**: shortest path in unweighted graphs, O(V+E)  
- **Depth‑First Search (DFS)**: pathfinding, cycle detection, topological sort, O(V+E)  

**Folder Contents**  
- `Graph.java` – builds adjacency list, addEdge()  
- `BFS.java` – level‑order traversal, distance array  
- `DFS.java` – recursive & iterative methods  
- `Main.java` – example graph creation & traversal demos  

---

### 5. Hashing & Set Operations (`Hashset/`)

**Concept**  
A **hash table** maps keys → buckets via hash function. Average O(1) lookup/insert/delete.

**Collision Handling**  
- **Chaining**: linked lists in each bucket  
- **Open Addressing**: probing (linear, quadratic)

**Set**  
- A collection of unique elements, exposes membership tests in O(1) average.

**Folder Contents**  
- `HashTableChaining.java` – custom implementation, put/get/remove  
- `OpenAddressingHashTable.java` – linear probing demo  
- `SetDemo.java` – Java’s `HashSet` usage examples  

---

### 6. Bit Manipulation (`BitManup/`)

**Concept**  
Directly operate on binary representations to achieve constant‑time tricks.

**Common Techniques**  
- **Check bit**: `(n & (1 << k)) != 0`  
- **Set bit**: `n | (1 << k)`  
- **Clear bit**: `n & ~(1 << k)`  
- **Toggle bit**: `n ^ (1 << k)`  
- **Count bits**: Brian Kernighan’s algorithm, built‑in `Integer.bitCount()`  

**Folder Contents**  
- `BitUtils.java` – utility methods for each operation  
- `PracticeProblems.java` – sample problems (single number, power of two)  

---

### 7. Searching Algorithms (`Searching/`)

**Algorithms**  
- **Linear Search**: O(n), trivial scan  
- **Binary Search**: O(log n) on sorted arrays  
- **Interpolation Search**: O(log log n) average for uniformly distributed data  

**Folder Contents**  
- `LinearSearch.java`  
- `BinarySearch.java`  
- `InterpolationSearch.java`  
- `Main.java` – benchmarks & comparisons  

---

### 8. Sorting Algorithms (`Sorting/`)

**Comparison‑Based Sorts**  
- **Bubble Sort**: O(n²), educational  
- **Insertion Sort**: O(n²), adaptive for small / nearly sorted arrays  
- **Merge Sort**: O(n log n), stable, divide‑and‑conquer  
- **Quick Sort**: O(n log n) average, O(n²) worst, in‑place  
- **Heap Sort**: O(n log n), in‑place, not stable  

**Folder Contents**  
- `BubbleSort.java`  
- `InsertionSort.java`  
- `MergeSort.java`  
- `QuickSort.java`  
- `HeapSort.java`  
- `SortTester.java` – time comparisons on random arrays  

---

### 9. Efficient String Operations (`String_builder/`)

**Concept**  
`String` concatenation in Java can be O(n²). Use `StringBuilder` (or `StringBuffer`) to build strings in O(n).

**Folder Contents**  
- `StringBuilderDemo.java` – append, insert, reverse, toString()  
- `StringAlgorithms.java` – common string problems using builder  

---

## 🚀 Getting Started

1. **Clone** this repo:  
   ```bash
   git clone https://github.com/raj04h/DSA.git
   cd DSA
