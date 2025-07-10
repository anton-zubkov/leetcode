## 📚 Data Structures — Time Complexity Cheat Sheet

| Data Structure | Operation | Average Time | Worst Time | Space Complexity |
|----------------|-----------|---------------|----------------|------------------|
| **Array** | Access (get) | **O(1)** | O(1) | O(n) |
| | Insert | O(n) | O(n) | |
| | Delete | O(n) | O(n) | |
| | Search | O(n) | O(n) | |
| **Linked List (Singly/Doubly)** | Access | O(n) | O(n) | O(n) |
| | Insert | O(1) (head) / O(n) (anywhere) | O(n) | |
| | Delete | O(1) (head) / O(n) (search) | O(n) | |
| | Search | O(n) | O(n) | |
| **Stack (LinkedList/Array)** | Push | O(1) | O(1) | O(n) |
| | Pop | O(1) | O(1) | |
| | Peek | O(1) | O(1) | |
| **Queue (LinkedList/Array)** | Enqueue | O(1) | O(1) | O(n) |
| | Dequeue | O(1) | O(1) | |
| | Peek | O(1) | O(1) | |
| **Hash Table (HashMap)** | Insert (put) | O(1) | O(n) (all collide) | O(n) |
| | Delete | O(1) | O(n) | |
| | Search (get) | O(1) | O(n) | |
| **Binary Search Tree (BST)** | Insert | O(log n) | O(n) | O(n) |
| | Delete | O(log n) | O(n) | |
| | Search | O(log n) | O(n) | |
| **Balanced BST (AVL, Red-Black Tree)** | Insert | O(log n) | O(log n) | O(n) |
| | Delete | O(log n) | O(log n) | |
| | Search | O(log n) | O(log n) | |
| **Heap (Min/Max)** | Insert | O(log n) | O(log n) | O(n) |
| | Delete (Extract Min/Max) | O(log n) | O(log n) | |
| | Peek (Min/Max) | O(1) | O(1) | |
| **Trie (Prefix Tree)** | Insert | O(m) | O(m) | O(n * m) |
| | Search | O(m) | O(m) | |
| | Delete | O(m) | O(m) | |
| **Graph (Adjacency List)** | Add Edge | O(1) | O(1) | O(V + E) |
| | Remove Edge | O(E) | O(E) | |
| | Search | O(V + E) | O(V + E) | |
| **Graph (Adjacency Matrix)** | Add Edge | O(1) | O(1) | O(V²) |
| | Remove Edge | O(1) | O(1) | |
| | Search | O(V²) | O(V²) | |

---

**🔑 Notes:**
- `n` — number of elements
- `m` — length of the key (for Trie)
- `V` — number of vertices
- `E` — number of edges
- Worst case for `HashTable` = many collisions (bad hash function) ➜ behaves like linked list.