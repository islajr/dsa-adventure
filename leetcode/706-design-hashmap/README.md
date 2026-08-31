# LC 706: [Design HashMap]


> **Date:** [2026-08-31]

> **Description:** [LC 706 ](https://leetcode.com/problems/design-hashmap/description/)

> **Difficulty:** [Easy]

> **Category:** [[dsa-concepts#[Arrays|Arrays]]

## Approach

### [Arrays]

> **Time Complexity:** $O(1)$

> **Space Complexity:** $O(100000)$

This problem is an extension of [[LC 705 - Design HashSet]], but requires a bit more nuanced thinking. We are required to design a hashmap data structure without the use of any built-in mapping data structures. The most intuitive one is to use a list in some form. The problem description constrains the number of key-value pairs to be stored at 1,000,000. It also requires us to return -1 for keys and values not contained in the map. These are useful because we can simply use an array of 1,000,000 elements with default values of -1. To implement `put()`, we simply store that provided value at the index of the key. `get()` follows the same logic for retrieval, and `remove()` simply resets the value to 0. 


``` python
class MyHashMap:

    def __init__(self):
        self.map = [-1] * 1000001

    def put(self, key: int, value: int) -> None:
        self.map[key] = value

    def get(self, key: int) -> int:
        return self.map[key]

    def remove(self, key: int) -> None:
        self.map[key] = -1
```

---
Tags: #dsa #leetcode #arrays 
